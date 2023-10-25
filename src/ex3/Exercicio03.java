package ex3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
// Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra, escrever:
// F - Feminino  M - Masculino  Sexo inválido
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a letra F ou M: ");
        String letter = scan.next();

        if (!letter.equals("F") && !letter.equals("M")) {
            System.out.println("Digite uma letra válida.");
        } else if (letter.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Masculino");
        }
    }
}
