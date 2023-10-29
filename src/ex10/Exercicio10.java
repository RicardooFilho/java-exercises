package ex10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
/* 11.As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
- Faça um programa que recebe o salário de um colaborador e o
- reajuste segundo o seguinte critério, baseado no salário atual:
- salários até R$ 280,00 (incluindo) : aumento de 20%
- salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
- salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
- salários de R$ 1500,00 em diante : aumento de 5% Após o
- aumento ser realizado, informe na tela:
- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- o novo salário, após o aumento.*/
        Scanner scan = new Scanner(System.in);

        Double newSalary;
        Double difference;

        System.out.println("Informe seu salário: ");
        Double salary = scan.nextDouble();

        System.out.println("Salário antes do reajuste: " + salary);

        if (salary <= 280.00) {
            System.out.println("Aumento de 20%");
            newSalary = salary * 1.2;
            difference = newSalary - salary;
        } else if (salary > 280.00 && salary <= 700.00) {
            System.out.println("Aumento de 15%");
            newSalary = salary * 1.15;
            difference = newSalary - salary;
        } else if (salary > 700.00 && salary < 1500.00) {
            System.out.println("Aumento de 10%");
            newSalary = salary * 1.1;
            difference = newSalary - salary;
        } else {
            System.out.println("Aumento de 5%");
            newSalary = salary * 1.05;
            difference = newSalary - salary;
        }

        System.out.println("Valor do aumento: " + difference);
        System.out.println("Novo salário: " + newSalary);
    }
}
