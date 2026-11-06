public class Produto 
{
    private String nome;
    private double preco;
    private int estoque;

    public static int totalProdutos = 0;

    public Produto(String nome, double preco, int estoque)
    {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        totalProdutos++;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        if (preco >= 0.0)
            this.preco = preco;
        else
            System.out.println("Preço inválido.");
    }

    public int getEstoque()
    {
        return estoque;
    }

    public void setEstoque(int estoque)
    {
        if (estoque >= 0)
            this.estoque = estoque;
        else
            System.out.println("Quantidade inválida.");
    }

    // MÉTODOS
    public double calcularValorEstoque()
    {
        double valorEstoque = this.preco * this.estoque;
        return valorEstoque;
    }

    public static int totalProdutosCriados()
    {
        return totalProdutos;
    }
}