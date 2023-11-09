package ex24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
/*25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
'Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
Caso contrário, ele será classificado como " Inocente".*/
        Scanner scan = new Scanner(System.in);

        String answer1 = null;

        String answer2 = null;

        String answer3 = null;

        String answer4 = null;

        String answer5 = null;

        Integer count = 0;

        do {
            System.out.println("Você telefonou para a vítima? ");
            answer1 = scan.next().toLowerCase();
        } while (!answer1.equals("y") && !answer1.equals("n"));

        if (answer1.equals("y")) {
            count += 1;
        }

        do {
            System.out.println("Esteve no local do crime? ");
            answer2 = scan.next().toLowerCase();
        } while (!answer2.equals("y") && !answer2.equals("n"));

        if (answer2.equals("y")) {
            count += 1;
        }

        do {
            System.out.println("Mora perto da vítima?" );
            answer3 = scan.next().toLowerCase();
        } while (!answer3.equals("y") && !answer3.equals("n"));

        if (answer3.equals("y")) {
            count += 1;
        }

        do {
            System.out.println("Devia para a vítima? ");
            answer4 = scan.next().toLowerCase();
        } while (!answer4.equals("y") && !answer4.equals("n"));

        if (answer4.equals("y")) {
            count += 1;
        }

        do {
            System.out.println("Já trabalhou com a vítima? ");
            answer5 = scan.next().toLowerCase();
        } while (!answer5.equals("y") && !answer5.equals("n"));

        if (answer5.equals("y")) {
            count += 1;
        }

        switch (count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Sem provas suficientes");
                break;
        }
    }
}
