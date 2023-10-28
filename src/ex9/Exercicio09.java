package ex9;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
/*10. Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!" conforme o caso. */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu turno de estudo (M, V ou N)");
        String letter = scan.next().toLowerCase();

        switch (letter) {
            case "m":
                System.out.println("Manhã");
                break;
            case "v":
                System.out.println("Vespertino");
                break;
            case"n":
                System.out.println("Noturno");
                break;
            default:
                System.out.println("Turno Inválido");
                break;
        }
    }
}
