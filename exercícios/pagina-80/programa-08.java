/*
8) Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma
circunferência e apresente a medida da área calculada. Sabe-se que para realizar o cálculo da
área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r² . O
valor do Raio será informado pelo usuário
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos calcular a área desse círculo. Informe o raio dele:");
        double r = teclado.nextDouble();
        double pi = Math.PI;
        double a = pi * (r*r);

        System.out.printf("A área do círculo é %.4f%n", a);
    }
}