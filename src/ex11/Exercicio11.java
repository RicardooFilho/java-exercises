package ex11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
/*12. Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o indicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.*/
        Scanner scan = new Scanner(System.in);

        String ir;
        Double irValue = null;

        System.out.println("Digite o valor da sua hora");
        Double hourValue = scan.nextDouble();

        System.out.println("Digite quantas horas trabalhou no mês");
        Integer workedHours = scan.nextInt();

        Double grossWage = hourValue * workedHours;

        if (grossWage <= 900.00) {
            ir = "Isento";
        } else if (grossWage > 900.00 && grossWage <= 1500.00) {
            ir = "5%";
            irValue = grossWage * 0.05;
        } else if (grossWage > 1500.00 && grossWage <= 2500.00) {
            ir = "10%";
            irValue = grossWage * 0.1;
        } else {
            ir = "20%";
            irValue = grossWage * 0.2;
        }

        System.out.println("Salário Bruto: (" + hourValue + " * " + workedHours + "):" + "\t\t" + "R$" + hourValue * workedHours);
        System.out.println("(-) IR (" + ir + "):" + "\t\t\t\t\t" + "R$" + irValue);
        System.out.println("(-) INSS (10%): " + "\t\t\t\t" + "R$" + grossWage * 0.1);
        System.out.println("FGTS (11%): " + "\t\t\t\t\t" + "R$" + grossWage * 0.11);
        System.out.println("Total de descontos: " + "\t\t\t" + "R$" + (irValue + (grossWage * 0.1)));
        System.out.println("Salário Líquido: " + "\t\t\t\t" + "R$" + (grossWage - (irValue + (grossWage * 0.1))));
    }
}
