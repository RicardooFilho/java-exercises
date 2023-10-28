package ex8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
//9. Faça um Programa que leia três números e mostre-os em ordem
//decrescente.
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Digite três valores");
        numbers.add(scan.nextInt());
        numbers.add(scan.nextInt());
        numbers.add(scan.nextInt());

//        Integer value1 = scan.nextInt();
//        Integer value2 = scan.nextInt();
//        Integer value3 = scan.nextInt();

//        numbers.add(value1);
//        numbers.add(value2);
//        numbers.add(value3);

        Collections.sort(numbers);

        System.out.println(numbers);
    }
}
