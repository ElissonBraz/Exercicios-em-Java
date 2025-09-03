package IfeElse;
import java.util.Scanner;

/*
 * 1º Verificar número par ou ímpar
 * Escrava um programa que leia um número inteiro e verifique se ele é par ou ímpar.
 * Dica: um número é par se o resto da divisão por 2 for igual a zero.
 * Caso contrário, o número é ímpar.
 * Dica: utilize o operador % (módulo) para obter o resto da divisão.
 * Exiba Par ou Ímpar conforme o resultado da verificação.
 * Exemplo:
 * Entrada: 4 Saída: Par
 * Entrada: 7 Saída: Ímpar
 */

public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero, resto;
        System.out.println("Digite um número inteiro: ");
        numero = leia.nextInt();
        resto = numero % 2;
        if (resto == 0) {
            System.out.println("O número " + numero + " é Par.");
        } else {
            System.out.println("O número " + numero + " é Ímpar.");
        }
        leia.close();   
    }
}
