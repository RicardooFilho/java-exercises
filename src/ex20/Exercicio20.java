package ex20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
/*21. Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
O valor mínimo é de 10 reais e o máximo de 600
reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa
fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
quatro notas de 10, uma nota de 5 e quatro notas de 1.*/
        Scanner scan = new Scanner(System.in);

        Integer value = 0;

        Integer hundred = 0;

        Integer fifty = 0;

        Integer ten = 0;

        Integer five = 0;

        Integer one = 0;

        do {
            System.out.println("Informe o valor que irá sacar: ");
            value = scan.nextInt();
        } while (value < 10 || value > 600);

        if (value >= 100) {
            hundred = value / 100;
            value -= hundred * 100;
            System.out.println("Notas de 100: " + hundred);
        }

        if (value >= 50) {
            fifty = value / 50;
            value -= fifty * 50;
            System.out.println("Notas de 50: " + fifty);
        }

        if (value >= 10) {
            ten = value / 10;
            value -= ten * 10;
            System.out.println("Notas de 10: " + ten);
        }

        if (value >= 5) {
            five = value / 5;
            value -= five * 5;
            System.out.println("Notas de 5: " + five);
        }

        if (value >= 1) {
            one = value / 1;
            value -= one * 5;
            System.out.println("Notas de 1: " + one);
        }
    }
}
