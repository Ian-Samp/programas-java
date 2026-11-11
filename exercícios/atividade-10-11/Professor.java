public class Professor 
{
    private String nome, areaFormacao;

    public Professor(String nome, String areaFormacao)
    {
        this.nome = nome;
        this.areaFormacao = areaFormacao;
    }

    //GET e SET
    public String getNome() { return nome; }

    public String getAreaFormacao() { return areaFormacao; }

    public void setNome(String nome) { this.nome = nome; }

    public void setAreaFormacao(String areaFormacao) { this.areaFormacao = areaFormacao; }
}