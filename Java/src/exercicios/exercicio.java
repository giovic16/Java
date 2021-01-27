package exercicios;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        // 1- Faça um Programa que mostre a mensagem "Alo mundo" na tela.
        System.out.println("Alo mundo");

        // 2- Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = numero.nextInt();
        System.out.printf("O número informado foi %d", num);


        // 3- Faça um Programa que peça dois números e imprima a soma.

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Primeiro número:");
        System.out.println("Segundo número:");
        int n1 = num1.nextInt();
        int n2 = num2.nextInt();
        int soma = n1 + n2;
        System.out.printf("A soma dos números é: %d", soma);


        // 4- Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner media = new Scanner(System.in);
        System.out.println("Primeira nota:");
        System.out.println("Segunda nota:");
        System.out.println("Terceira nota:");
        System.out.println("Quarta nota:");
        int n1 = media.nextInt();
        int n2 = media.nextInt();
        int n3 = media.nextInt();
        int n4 = media.nextInt();
        int media_final = (n1 + n2 + n3 + n4)/4;
        System.out.printf("Sua media final é: %d", media_final);

    }
}
