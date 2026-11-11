import java.util.ArrayList;
import java.util.List;

public class Curso
{
    private String nome;
    List<Professor> professores;

    public Curso(String nome)
    {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    //GET e SET
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    //Métodos
    public void novoProfessor(Professor prof) { this.professores.add(prof); }

    public void removerProfessor(Professor prof){ this.professores.remove(prof); }

    public void listarProfessores()
    {
        if (professores.isEmpty())
        {
            System.out.println("Não há nenhum professor neste curso.");
            return;
        } else {
            System.out.println("=======Lista de Professores=======");
            for (Professor p : this.professores)
                System.out.println(p);
        }
    }
}