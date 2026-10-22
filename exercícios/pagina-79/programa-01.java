/*
1) Construir um algoritmo utilizando a representação de fluxograma para que solicite ao
usuário a quantidade de horas trabalhadas no mês por um operário. Em seguida, calcular e
informar o seu salário sabendo que ele ganha R$ 20,00 por hora. 
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, operário(a)! Por favor, informe suas horas trabalhadas no mês:");
        int horas = teclado.nextInt();

        int salario = horas * 20;
        System.out.println("Ótimo! Com essas horas, você deve receber R$ " + salario + ".");
    }
}