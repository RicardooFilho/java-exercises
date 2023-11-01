package ex15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
/*16. Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
 Se o delta for positivo, a equação possui duas raiz reais, informe-as ao usuário;*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        Double valueA = scan.nextDouble();

        if (valueA == 0.0) {
            System.out.println("A equação não é de segundo grau");
            System.exit(0);
        }

        System.out.println("Informe o valor de b: ");
        Double valueB = scan.nextDouble();

        System.out.println("Informe o valor de c: ");
        Double valueC = scan.nextDouble();

        Double delta = (valueB * valueB) - (4.0 * valueA * valueC);

        Double seed1 = (-valueB + Math.sqrt(delta)) / (2 * valueA);

        Double seed2 = (-valueB - Math.sqrt(delta)) / (2 * valueA);

        if (delta < 0) {
            System.out.println("Equação não possui raízes reais");
            System.exit(0);
        } else if (delta == 0) {
            System.out.println("Equação possui apenas uma raíz real");
            System.out.println("Raiz: " + seed1);
            System.exit(0);
        } else if (delta > 0) {
            System.out.println("Equação possui duas raízes reais");
            System.out.println("Raíz 1: " + seed1 + "\t\t" + "Raíz 2: " + seed2);
            System.exit(0);
        }
    }
}
