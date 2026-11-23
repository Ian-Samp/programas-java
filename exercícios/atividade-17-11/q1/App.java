public class App
{
    public static void main(String[] args)
    {
        Brinquedo caminhao = new Caminhao();
        Brinquedo helicoptero = new Helicoptero();
        Brinquedo navio = new Navio();

        ControleRemoto controle1 = new ControleRemoto(caminhao);
        controle1.mover();
    
        ControleRemoto controle2 = new ControleRemoto(helicoptero);
        controle2.mover();
    
        ControleRemoto controle3 = new ControleRemoto(navio);
        controle3.mover();
    }
}