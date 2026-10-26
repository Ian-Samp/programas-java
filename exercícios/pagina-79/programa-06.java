/*
6) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as
notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. Caso a média
final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a
mensagem reprovado”.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, aluno(a). Informe as notas do primeiro e segundo trabalho:");
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Com esse notão de " + media +" aí você foi aprovado!");
        } else {
            System.out.println("Infelizmente, com a média " + media + " você foi reprovado.");
        }
    }
}