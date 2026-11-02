/*
10) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos.
Em seguida o algoritmo deverá efetuar a soma dos dois valores e
apresentar o resultado caso seja maior que 10.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Me informe dois números misteriosos...");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int resultado = n1 + n2;

        if (resultado > 10) {
            System.out.println("Hmmm... somados resultam em " + resultado + ", o que é maior que 10!!");
        } else { 
            System.out.println("Parece que o número é menor que 10, então você nunca saberá o resultado da soma! MUHAHAHAHAHAHAHHA");
        }
    }
}