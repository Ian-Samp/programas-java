/*
7) Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa
deve-se utilizar a fórmula: imc = pa2eso/altur. Caso o resultado do imc seja maior que 30 o
usuário está obeso.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos medir seu IMC. Informe seu peso em KG:");
        double peso = teclado.nextDouble();
        System.out.println("Ótimo. Agora informe sua altura em metros:");
        double altura = teclado.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("Seu IMC é %.2f%n", imc);
        
        if (imc >= 30.0) {
            System.out.println("Com este IMC, você é considerado obeso.");
        } else {
            System.out.println("Com este IMC, você não é considerado obeso.");
        }
    }
}