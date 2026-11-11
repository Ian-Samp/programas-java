import java.util.ArrayList;
import java.util.List;

public class Avaliacao
{
    private String titulo;
    List<Questao> questoes;

    public Avaliacao(String titulo)
    {
        this.titulo = titulo;
        this.questoes = new ArrayList<>();
    }

    //GET e SET
    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    //Métodos
    public void addQuestao(String enunciado, double pontuacao) { 
        this.questoes.add(new Questao(enunciado, pontuacao)); 
    }

    public void removerQuestao(Questao questao) { this.questoes.remove(questao); } 

    public void exibirAvaliacao()
    {
        if (questoes.isEmpty())
        {
            System.out.println("Não há nenhuma questão nesta avaliação.");
            return;
        } else {
            System.out.println("=======Avaliação=======");
            for (Questao q : this.questoes)
                System.out.println(q);
        }
    }

    public double calcularPontuacaoTotal()
    {
        double total = 0.0;
        for (Questao q : this.questoes)
            total += q.getPontuacao();
        
        return total;
    }
}