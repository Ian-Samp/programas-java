public class Vendedor
{
    private String nome;
    private int idade;

    public Vendedor(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    //GET e SET
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    //METODOS
    public void vender()
    {
        System.out.println("Uma venda foi realizada pelo vendedor " + this.nome + "!");
    }
}