/*
4) Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do
corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente
está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a
mensagem apropriada.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor, informe a temperatura indicada no termômetro.");
        double temp = teclado.nextDouble();

        if (temp >= 37.0) {
            System.out.println("Eita");
            System.out.println("Pela sua temperatura, parece que você está com febre.");
        } else if (temp < 37.0 && temp >= 28.0) {
            System.out.println("Tranquilo!");
            System.out.println("Temperatura normal.");
        } else {
            System.out.println("Bom...");
            System.out.println("Com FEBRE você não tá...");
        }
    }
}