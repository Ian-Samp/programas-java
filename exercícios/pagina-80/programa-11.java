/*
11) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o
resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário o valor do resultado
deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o
usuário.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Me informe dois números para que passem pela função misteriosa...");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int resultado = n1 + n2;

        resultado += (resultado >= 10) ? 5 : -7;

        System.out.println("Hmmm... o resultado após a função é " + resultado + "!!!!");
    }
}