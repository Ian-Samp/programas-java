/*
9) Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido
de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados,
tais como valor da hora aula, número de horas trabalhadas no mês, percentual de desconto do
INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor
do salário líquido.

pede hAula
pede hTrabalhada
pede inss
calcula sBruto = (hAula * hTrabalhada)
calcula sLiquido = (sBruto * (100 - inss)) / 100
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, prof! Vamos calcular seu salário líquido? Primeiro, infome sua hora aula:");
        double hAula = teclado.nextDouble();
        System.out.println("Ótimo. E quantas aulas o(a) senhor(a) trabalhou este mês?");
        double hTrabalhadas = teclado.nextDouble();
        System.out.println("Estamos quase lá. Só preciso saber a % de desconto para o INSS:");
        double inss = teclado.nextDouble();

        double sBruto = (hAula * hTrabalhadas);
        double sLiquido = (sBruto * (100 - inss)) / 100;

        System.out.printf("Seu salário bruto é R$%.2f e seu salário líquido é R$%.2f%n", sBruto, sLiquido);
    }
}