package ex18;

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

        Integer num = 0;

        do {
            System.out.println("Imprima um valor entre 1 e 1000");
            num = scan.nextInt();
        } while (num >= 1 && num < 1000);

        String numStr = Integer.toString(num);

        numStr = numStr.split(num);
    }
}
