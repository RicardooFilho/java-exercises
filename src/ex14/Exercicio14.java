package ex14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
/*15. Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno
Dicas:
Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os três lados do triângulo");
        Integer side1 = scan.nextInt();
        Integer side2 = scan.nextInt();
        Integer side3 = scan.nextInt();

        if (side1 + side2 < side3) {
            System.out.println("Não é um triângulo");
            System.exit(0);
        } else if (side1 + side3 < side2) {
            System.out.println("Não é um triângulo");
            System.exit(0);
        } else if (side2 + side3 < side1) {
            System.out.println("Não é um triângulo");
            System.exit(0);
        }

        if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println("É um triângulo equilátero");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("É um triângilo isósceles");
        } else if (side1 != side2 && side1 != side3 && side2 != side3) {
            System.out.println("É um triângulo escaleno");
        }
    }
}
