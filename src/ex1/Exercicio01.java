package ex1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
// Faça um programa que peça dois números e imprima o maior deles
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro e o segundo valor: ");
        Integer value1 = scan.nextInt();
        Integer value2 = scan.nextInt();

        if (value1 > value2) {
            System.out.println("Maior valor é: " + value1);
        } else if (value1 == value2){
            System.out.println("Os valores são iguais");
        } else {
            System.out.println("Maior valor é: " + value2);
        }


    }
}
