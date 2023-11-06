package ex22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
/*23. Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        Double value = scan.nextDouble();

        if (value > Math.floor(value)) {
            System.out.println("Número é um decimal");
        } else {
            System.out.println("Número é um inteiro");
        }
    }
}
