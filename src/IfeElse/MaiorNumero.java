package IfeElse;

import java.util.Scanner;

/*
 * 2º Verificar o maior número entre dois números
 * Escreva um programa que leia dois números inteiros e verifique qual deles é o maior.
 * Exiba o maior número na tela.
 * Exemplo:
 * Entrada: 5 e 8 Saída: O maior número é 8
 * Entrada: 12 e 3 Saída: O maior número é 12
 * Entrada: 7 e 7 Saída: Os números são iguais
 * Dica: utilize estruturas condicionais (if-else) para comparar os números e determinar o maior.
 * Dica: considere o caso em que os números são iguais.
 */
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int primeiro, segundo;
        System.out.println("Escreva o Primeiro Número: ");
        primeiro = leia.nextInt();
        System.out.println("Escreva o Segundo Número: ");
        segundo = leia.nextInt();
        if (primeiro > segundo) {
            System.out.println("O maior número é " + primeiro);
        }else if (primeiro < segundo) {
            System.out.println("O maior número é " + segundo);
        } else {
            System.out.println("Os números são iguais!");
        }
        leia.close();

    }
}
