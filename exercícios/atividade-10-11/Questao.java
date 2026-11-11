public class Questao
{
    private String enunciado;
    private double pontuacao;

    public Questao(String enunciado, double pontuacao)
    {
        this.enunciado = enunciado;
        this.pontuacao = pontuacao;
    }

    public String getEnunciado() { return enunciado; }

    public double getPontuacao() { return pontuacao; }

    public void setEnunciado(String enunciado) { this.enunciado = enunciado; }

    public void setPontuacao(double pontuacao){ this.pontuacao = pontuacao; }
}