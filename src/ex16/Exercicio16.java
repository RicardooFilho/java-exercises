package ex16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
/*17. Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        Integer year = scan.nextInt();

        if (year % 4 == 0) {
            System.out.println("É um ano bissexto");
        } else {
            System.out.println("Não é um ano bissexto");
        }
    }
}
