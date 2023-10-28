package ex7;

import java.util.Scanner;

public class Exercicio07 {
//7. Faça um Programa que leia três números e mostre o maior e o menor
//deles.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer maior;
        Integer menor;

        System.out.println("Digite três valores");
        Integer value1 = scan.nextInt();
        Integer value2 = scan.nextInt();
        Integer value3 = scan.nextInt();

        if (value1 > value2 && value1 > value3) {
            maior = value1;
            if (value2 < value3) {
                menor = value2;
            } else {
                menor = value3;
            }
        } else if (value2 > value1 && value2 > value3) {
            maior = value2;
            if (value1 < value3) {
                menor = value1;
            } else {
                menor = value3;
            }
        } else {
            maior = value3;
            if (value1 < value2) {
                menor = value1;
            } else {
                menor = value2;
            }
        }

        System.out.println("Maior: " + maior + "\t" + "Menor: " + menor);
    }
}
