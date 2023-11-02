package ex17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
/*18. Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um data: ");
        String date = scan.next();

        String dateFormat = "dd/MM/yyyy";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        LocalDate localDate = LocalDate.parse(date, formatter);

        if (localDate != null) {
            System.out.println("É uma data válida");
        } else {
            System.out.println("Não é uma data válida");
        }
    }
}
