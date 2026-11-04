public class Programa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Zé", 25, 44, "03/11/2026");

        f1.rg = "12345678";
        f1.cpf = "12345678901";
        f1.calculaSalario();
        f1.imprimeDados();

        Funcionario f2 = new Funcionario("Maria", 25, 40, "14/07/2026");
        
        f2.rg = "87654321";
        f2.cpf = "10987654321";
        f2.calculaSalario();
        f2.imprimeDados();
    }
}