package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
// Faça um programa que verifique se a letra digitada é vogal ou consoante

        Scanner scan = new Scanner(System.in);

        ArrayList<String> vogals = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));

        System.out.println("Digite uma letra do alfabeto: ");
        String letter = scan.next().toLowerCase();

        Boolean found = vogals.contains(letter);

        if (found) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
