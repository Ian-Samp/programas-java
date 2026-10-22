/*
5) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles.
*/ 

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Vamos lá, escolha dois números quaisquer:");
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();

        double maiorN = (n1 > n2) ? n1 : n2;

        if (n1 != n2) {
            System.out.println("Beleza! Nesse caso " + maiorN + " é o maior número.");
        } else {
            System.out.println("Calma lá! Os números são iguais!");
        }
    }
}