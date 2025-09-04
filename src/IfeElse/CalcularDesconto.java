package IfeElse;

import java.util.Scanner;

/*
 * 4º Calcular Desconto
 * Leia o valor de uma compra. Aplique 10% de desconto se o valor for
 * superior a 1000, 5% se estiver entre 500 (exclusivo) e 1000 (inclusivo), caso
 * contrário sem desconto. Exiba o valor final.
 */
public class CalcularDesconto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor, desconto, valorFinal, valorDesconto;
        int porcentagem;

        System.out.println("Digite o valor da sua compra: ");
        valor = leia.nextDouble();

        if (valor > 1000) {
            valorDesconto = 0.20;
            porcentagem = (int) (valorDesconto * 100);
            desconto = (valor * valorDesconto);
            valorFinal = valor - desconto;
            System.out.println("Você ganhou um desconto de "+ porcentagem +"%");
            System.out.printf("Desconto de R$ %.2f o Valor final é R$ %.2f", desconto, valorFinal);
        } else if (valor > 500 && valor < 1000) {
            valorDesconto = 0.05;
            porcentagem = (int) (valorDesconto * 100);
            desconto = (valor * 0.05);
            valorFinal = valor - desconto;
            System.out.println("Você ganhou um desconto de "+ porcentagem +"%");
            System.out.printf("Desconto de R$ %.2f o Valor final é R$ %.2f", desconto, valorFinal);
        } else {
            valorFinal = valor;
            System.out.println("Você não ganhou desconto");
            System.out.printf("Valor final é R$ %.2f", valorFinal);
        }
        leia.close();
    }
}
