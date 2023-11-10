package ex25;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
/*26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool: até 20 litros, desconto de 3% por litro acima de 20 litros, desconto de 5% por litro
Gasolina: até 20 litros, desconto de 4% por litro acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma:
A-álcool,
G- gasolina),
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 0 preço
do litro do álcool é R$ 1,90.*/
        Scanner scan = new Scanner(System.in);

        DecimalFormat formatted = new DecimalFormat("0.00");

        String fuel = null;

        Integer qty = 0;

        Double fuelLiterDiscount = 0.0;

        Double value = 0.0;

        do {
        System.out.println("Informe qual será o combustível: (A - Álcool / G - Gasolina)");
        fuel = scan.next().toLowerCase();
        } while (!fuel.equals("g") && !fuel.equals("a"));

        System.out.println("Informe quantos litros: ");
        qty = scan.nextInt();

        if (fuel.equals("g")) {
            if (qty <= 20) {
                fuelLiterDiscount = 2.50 * 0.96;
                value = qty * fuelLiterDiscount;
            } else if (qty > 20) {
                fuelLiterDiscount = 2.50 * 0.94;
                value = qty * fuelLiterDiscount;
            }
        } else if (fuel.equals("a")) {
            if (qty <= 20) {
                fuelLiterDiscount = 1.90 * 0.97;
                value = qty * fuelLiterDiscount;
            } else if (qty > 20) {
                fuelLiterDiscount = 1.90 * 0.95;
                value = qty * fuelLiterDiscount;
            }
        }

        System.out.println("Valor a pagar: " + value);
    }
}
