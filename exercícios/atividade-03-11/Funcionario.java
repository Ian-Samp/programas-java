public class Funcionario {
    String nome, cpf, rg, dataContratacao;
    private int matricula;
    private double salario, salarioBase, horasTrabalhadas;
    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, double horasTrabalhadas, String dataContratacao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = dataContratacao;
    
        matricula = geraMatricula++;
    }

    public void calculaSalario() {
        Calculo calc = new Calculo();
        calc.calculaSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = calc.getTotalSalario();
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de Contratacao: " + dataContratacao);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário Total: " + salario);
        System.out.println("=========================================");
    }
}