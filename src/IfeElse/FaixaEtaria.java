package IfeElse;

import java.util.Scanner;

/*
 * 3º Classificar faixa etária
 * Leia a idade de uma pessoa e exiba uma das mensagens: "Criança" (0-11 anos),
 * "Adolescente" (12-17 anos), "Adulto" (18-64 anos) ou "Idoso" (65 anos ou mais).
 */
public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        System.out.println("Qual a sua idade? ");
        idade = leia.nextInt();

        if (idade >= 0 && idade < 12) {
            System.out.println("Criança");
        } else if (idade > 11 && idade < 18) {
            System.out.println("Adolescente");
        }else if (idade > 17 && idade < 65) {
            System.out.println("Adulto");
        } else  {
            System.out.println("Idoso");
        }
        leia.close();
    }
}
