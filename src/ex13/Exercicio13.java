package ex13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
/*14. Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento
9.0 e 10.0     A
7.5 e 9.0      B
6.0 e 7.5      C
4.0 e 6.0      D
0.0 e 4.0      E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem "APROVADO" se o conceito for
A, B ou C ou "REPROVADO" se o conceito for D ou E.*/
        Scanner scan = new Scanner(System.in);

        String concept;
        String status;

        System.out.println("Digite suas duas notas: ");
        Double grade1 = scan.nextDouble();
        Double grade2 = scan.nextDouble();

        Double media = (grade1 + grade2) / 2;

        if (media >= 9.0 && media <= 10.0) {
            concept = "A";
            status = "Aprovado";
        } else if (media >= 7.5 && media < 9.0) {
            concept = "B";
            status = "Aprovado";
        } else if (media >= 6.0 && media < 7.5) {
            concept = "C";
            status = "Aprovado";
        } else if (media >= 4.0 && media < 6.0) {
            concept = "D";
            status = "Reprovado";
        } else if (media >= 0.0 && media < 4.0) {
            concept = "E";
            status = "Reprovado";
        } else {
            concept = null;
            status = null;
        }

        System.out.println("Suas notas foram: " + grade1 + "\t" + grade2);
        System.out.println("Sua média foi de: " + media);
        System.out.println("Seu conceito: " + concept);
        System.out.println("Seu status: " + status);
    }
}
