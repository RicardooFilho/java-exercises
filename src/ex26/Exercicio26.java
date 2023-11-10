package ex26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
/*27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
        Até 5 Kg        Acima de 5 Kg
Morango R$ 2,50 por Kg  R$ 2,20 por Kg
Maçã    R$ 1,80 por Kg  R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.*/
        Scanner scan = new Scanner(System.in);

        Integer appleKG = 0;

        Integer strawberryKG = 0;

        Double purchaseValue = 0.0;

        System.out.println("Quantos KG de maçã serão comprados? ");
        appleKG = scan.nextInt();

        System.out.println("Quantos KG de morango serão comprados? ");
        strawberryKG = scan.nextInt();

        if (strawberryKG <= 5) {
            purchaseValue += strawberryKG * 2.50;
        } else if (strawberryKG > 5) {
            purchaseValue += strawberryKG * 2.20;
        }

        if (appleKG <= 5) {
            purchaseValue += appleKG * 1.80;
        } else if (appleKG > 5) {
            purchaseValue += appleKG * 1.50;
        }

        if (purchaseValue > 25.00 || appleKG + strawberryKG > 8) {
            purchaseValue *= 0.9;
        }

        System.out.println("Valor a ser pago: " + purchaseValue);
    }
}
