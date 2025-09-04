package IfeElse;

import java.util.Scanner;

/*
 * 5º Avaliar conceito escolar
 * Leia uma nota entre 0 e 100 e exiba o conceito correspondente: A (>=90), B (>= 80),
 *  C(>=70), D(>=60) ou F (<60).
 */
public class Avaliacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 100: ");
        double nota = leia.nextDouble();

        if (nota >= 90) {
            System.out.println("Nota A");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("Nota B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("Nota C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("Nota D");
        } else {
            System.out.println("Nota F");
        }
        leia.close();
    }
}
