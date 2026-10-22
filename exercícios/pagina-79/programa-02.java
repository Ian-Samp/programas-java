/*
2) Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro
da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro.

informa distancia
informa precoGasolina
calcula litrosGasolina = distancia / mediaCarro
calcula custo = litrosGasolina * precoGasolina
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mediaCarro = 12;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, me diga a distância total da viagem em quilômetros:");
        double distancia = teclado.nextDouble();
        System.out.println("Beleza! Agora me diz o preço da gasolina:");
        double precoGasolina = teclado.nextDouble();

        double litrosGasolina = distancia / mediaCarro;
        double custo = litrosGasolina * precoGasolina;

        System.out.println("OK");
        System.out.printf("Você vai precisar de %.2f litros.%n", litrosGasolina);
        System.out.printf("Isso vai sair por R$ %.2f%n", custo);
    }
}