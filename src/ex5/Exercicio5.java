package ex5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
//        Faça um programa para a leitura de duas notas parciais de um aluno.
//                O programa deve calcular a média alcançada por aluno e apresentar:
//        A mensagem "Aprovado", se a média alcançada for maior ou
//        igual a sete;
//        A mensagem "Reprovado", se a média for menor do que sete;
//        A mensagem "Aprovado com Distinção", se a média for igual a
//        dez.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas duas notas: ");
        Double grade1 = scan.nextDouble();
        Double grade2 = scan.nextDouble();

        Double media = (grade1 + grade2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
