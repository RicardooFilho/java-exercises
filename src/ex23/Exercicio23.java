package ex23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
/*24. Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo
inteiro ou decimal*/
        Scanner scan = new Scanner(System.in);

        Double result = 0.0;

        System.out.println("Informe dois números: ");
        Double value1 = scan.nextDouble();
        Double value2 = scan.nextDouble();

        System.out.println("Qual operação você deseja realizar com os números? (+, -, *, /)");
        String operation = scan.next();

        switch (operation) {
            case "+":
                result += value1 + value2;

                System.out.println("Resultado da operação: " + result);

                if (result.intValue() % 2 == 0) {
                    System.out.println("Resultado da operação é Par");
                } else {
                    System.out.println("Resultado da operação é Ímpar");
                }

                if (result > 0) {
                    System.out.println("Resultado da operação é Positivo");
                } else if (result < 0) {
                    System.out.println("Resultado da operação é Negativo");
                } else {
                    System.out.println("Resultado da operação é igual à 0");
                }

                if (result > Math.floor(result)) {
                    System.out.println("Resultado da operação é Decimal");
                } else {
                    System.out.println("Resultado da operação é Inteiro");
                }
                break;
            case "-":
                result += value1 - value2;

                System.out.println("Resultado da operação: " + result);

                if (result.intValue() % 2 == 0) {
                    System.out.println("Resultado da operação é Par");
                } else {
                    System.out.println("Resultado da operação é Ímpar");
                }

                if (result > 0) {
                    System.out.println("Resultado da operação é Positivo");
                } else if (result < 0) {
                    System.out.println("Resultado da operação é Negativo");
                } else {
                    System.out.println("Resultado da operação é igual à 0");
                }

                if (result > Math.floor(result)) {
                    System.out.println("Resultado da operação é Decimal");
                } else {
                    System.out.println("Resultado da operação é Inteiro");
                }
                break;
            case "*":
                result += value1 * value2;

                System.out.println("Resultado da operação: " + result);

                if (result.intValue() % 2 == 0) {
                    System.out.println("Resultado da operação é Par");
                } else {
                    System.out.println("Resultado da operação é Ímpar");
                }

                if (result > 0) {
                    System.out.println("Resultado da operação é Positivo");
                } else if (result < 0) {
                    System.out.println("Resultado da operação é Negativo");
                } else {
                    System.out.println("Resultado da operação é igual à 0");
                }

                if (result > Math.floor(result)) {
                    System.out.println("Resultado da operação é Decimal");
                } else {
                    System.out.println("Resultado da operação é Inteiro");
                }
                break;
            case "/":
                result += value1 / value2;

                System.out.println("Resultado da operação: " + result);

                if (result.intValue() % 2 == 0) {
                    System.out.println("Resultado da operação é Par");
                } else {
                    System.out.println("Resultado da operação é Ímpar");
                }

                if (result > 0) {
                    System.out.println("Resultado da operação é Positivo");
                } else if (result < 0) {
                    System.out.println("Resultado da operação é Negativo");
                } else {
                    System.out.println("Resultado da operação é igual à 0");
                }

                if (result > Math.floor(result)) {
                    System.out.println("Resultado da operação é Decimal");
                } else {
                    System.out.println("Resultado da operação é Inteiro");
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
