package ex18;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
/*19. Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/
        Scanner scan = new Scanner(System.in);

        String[] numbers;

        String hundreds = null;

        String dozens = null;

        String units = null;

        Integer num = 0;

        do {
            System.out.println("Imprima um valor entre 1 e 1000");
            num = scan.nextInt();
        } while (num < 1 || num >= 1000);

        String numStr = num.toString();

        numbers = numStr.split("");

        if (numbers.length == 3) {
            if (numbers[0].equals("1")) {
                hundreds = numbers[0] + " centena, ";
            } else {
                hundreds = numbers[0] + " centenas, ";
            }

            if (numbers[1].equals("1")) {
                dozens = numbers[1] + " dezena e ";
            } else {
                dozens = numbers[1] + " dezenas e ";
            }

            if (numbers[2].equals("1")) {
                units = numbers[2] + " unidade";
            } else {
                units = numbers[2] + " unidades";
            }
        } else if (numbers.length == 2) {
            if (numbers[0].equals("1")) {
                dozens = numbers[0] + " dezena e ";
            } else {
                dozens = numbers[0] + " dezenas e ";
            }

            if (numbers[1].equals("1")) {
                units = numbers[1] + " unidade";
            } else {
                units = numbers[1] + " unidades";
            }
        } else if (numbers.len)

        System.out.println(hundreds + dozens + units);
//        System.out.println(numbers[0] + " centenas, " + numbers[1] + " dezenas e " + numbers[2] + " unidades");
//        System.out.println(numbers[0] + " dezenas e " + numbers[1] + " unidades");
//        System.out.println(numbers[0] + " unidades");
    }
}
