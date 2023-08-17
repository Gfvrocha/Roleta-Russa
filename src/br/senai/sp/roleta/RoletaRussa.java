package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

public class RoletaRussa {
    public static void main(String[] args) {
        /** Declarar as Variaveis */
        int userNumber, numberRandom;
        String nome;
        boolean continuar = true;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instancia Random */
        Random random = new Random();

        while (continuar){

            /** Coleta Dados */
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("----------------   Bem Vindo   --------------------");
            System.out.print("Qual é o seu nome: ");
            nome = teclado.next();
            System.out.print("Olá, " + nome + " Digite seu numero da sorte [1-10]: ");
            userNumber = teclado.nextInt();
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            /** Logica do Jogo */

            numberRandom = random.nextInt(10) + 1;

            if(userNumber == numberRandom) {
                continuar = false;
                System.out.println("Você Perdeu !");

            } else {
                System.out.println("Parabens!!! Você Ganhou");
            }
        }

    }
}
