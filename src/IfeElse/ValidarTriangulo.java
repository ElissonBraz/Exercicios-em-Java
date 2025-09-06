package IfeElse;

import java.util.Scanner;

/*
 * 7º Validar Triângulo
 * Leia três comprimentos de lados inteiros. Verifique se podem formar 
 * um triângulo (soma de dois lados maior que o terceiro). Se não, exiba "Não é triângulo". 
 * Se sim, classifique como "Equilátero", "Isósceles" ou "Escaleno".
 */
public class ValidarTriangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        System.out.println("Digite três comprimentos de lados inteiros para um triângulo");
        System.out.println("============================================================");
        System.out.println("Digite o comprimento do lado A: ");
        ladoA = leia.nextInt();
        System.out.println("Digite o comprimento do lado B: ");
        ladoB = leia.nextInt();
        System.out.println("Digite o comprimento do lado C: ");
        ladoC = leia.nextInt();

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) {
            if (ladoA == ladoB && ladoB == ladoC && ladoA == ladoC) {
                System.out.println("Triângulo Equilátero!");
            } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Não é Triângulo");
        }
        leia.close();
    }
}
