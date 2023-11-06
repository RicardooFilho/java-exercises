package ex21;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
/*22. Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        Integer value = scan.nextInt();

        if (value % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

    }
}
