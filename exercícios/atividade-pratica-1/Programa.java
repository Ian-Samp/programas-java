public class Programa 
{
    public static void main(String[] args)
    {
        Produto p1 = new Produto("Refrigerante", 6.50, 8);
        Produto p2 = new Produto("Ração p/ Gato", 23.75, 4);
        Produto p3 = new Produto("Biscoito", 1.65, 16);



        System.out.println("========Produtos no Estoque========");
        System.out.println("- " + p1.getNome() + " -> R$ " + p1.getPreco());
        System.out.println("- " + p2.getNome() + " -> R$ " + p2.getPreco());
        System.out.println("- " + p3.getNome() + " -> R$ " + p3.getPreco());

        System.out.println("========Valor de Estoque========");
        System.out.printf("Valor em estoque de " + p1.getNome() +": R$ %.2f%n", p1.calcularValorEstoque());
        System.out.printf("Valor em estoque de " + p2.getNome() +": R$ %.2f%n", p2.calcularValorEstoque());
        System.out.printf("Valor em estoque de " + p3.getNome() +": R$ %.2f%n", p3.calcularValorEstoque());

        System.out.println("========Total de Produtos Criados========");
        System.out.println(Produto.totalProdutosCriados() + " produtos no site");

        System.out.println("========Teste de Valores Inválidos========");
        p1.setPreco(-5.0);
        p3.setEstoque(-10);
    }
}