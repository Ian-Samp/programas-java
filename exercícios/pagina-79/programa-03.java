/*
3)Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua
idade e informe se o mesmo já pode tirar carteira de motorista. O usuário somente poderá
tirar a carteira de motorista se a idade for maior que 18 anos.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Pronto para tirar a carteira?");
        System.out.println("Então informe sua idade, por favor.");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Ótimo!");
            System.out.println("Pela sua idade, você já pode tirar a carteira!");
        } else {
            System.out.println("Parece que você não tem idade para tirar a carteira ainda.");
            System.out.println("Tente novamente mais tarde...");
            System.out.println("(Daqui a uns anos)");
        }
    }
}