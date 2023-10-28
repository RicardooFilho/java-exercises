package ex6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior deles.
        Scanner scan = new Scanner(System.in);

        Integer maior;

        System.out.println("Informe os três valores: ");
        Integer value1 = scan.nextInt();
        Integer value2 = scan.nextInt();
        Integer value3 = scan.nextInt();

        if (value1 > value2 && value1 > value3) {
            maior = value1;
        } else if (value2 > value1 && value2 > value3) {
            maior = value2;
        } else {
            maior = value3;
        }

        System.out.println("Maior número é: " + maior);
    }
}
