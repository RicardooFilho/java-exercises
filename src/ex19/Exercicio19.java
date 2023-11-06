package ex19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
/*20. Faça um Programa para leitura de três notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e presentar:
A mensagem "Aprovado", se a média for maior ou igual a 7,
com a respectiva média alcançada;
a. A mensagem "Reprovado", se a média for menor do que 7, com
a respectiva média alcançada;
b. A mensagem "Aprovado com Distinção", se a média for igual a 10.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        Double grade1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        Double grade2 = scan.nextDouble();

        System.out.println("Informe a terceira nota: ");
        Double grade3 = scan.nextDouble();

        Double media = (grade1 + grade2 + grade3) / 3;

        if (media == 10.0) {
            System.out.println("Aprovado com distinção" + "\t\t" + "Sua média: " + media);
        } else if (media >= 7.0 && media <= 9.9) {
            System.out.println("Aprovado" + "\t\t" + "Sua média: " + media);
        } else if (media < 7.0 && media >= 0.0) {
            System.out.println("Reprovado" + "\t\t" + "Sua média: " + media);
        } else {
            System.out.println("Média inválida");
        }
    }
}
