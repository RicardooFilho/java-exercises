package ex2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        Integer value = scan.nextInt();

        if (value >= 0) {
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número Negativo");
        }
    }
}
