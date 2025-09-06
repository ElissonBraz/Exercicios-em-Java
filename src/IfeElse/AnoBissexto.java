package IfeElse;

import java.util.Scanner;

/*
 * 6º Verificar o ano bissexto
 * Leia um ano e verifique se ele é bissexto. Considere as regras:
 * divisível por 4 e não por 100, ou divisível por 400. Exiba "Bissexto" 
 * ou "Não é bissexto".
 */
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ano, primeiroDividor, segundoDivisor, terceiroDivisor;
        System.out.println("Digite o ano quer saber se é Bissexto: ");
        ano = leia.nextInt();
        primeiroDividor = 4;
        segundoDivisor = 100;
        terceiroDivisor = 400;

        if (ano % primeiroDividor == 0 && ano % segundoDivisor != 0) {
            System.out.println("Bissexto");
        } else if (ano % segundoDivisor == 0 && ano % segundoDivisor == 0 && ano % terceiroDivisor == 0) {
            System.out.println("Bissexto");
        } else {
            System.out.println("Não é Bissexto");
        leia.close();
    }
}

}
