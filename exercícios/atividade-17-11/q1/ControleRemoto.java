public class ControleRemoto
{
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo brinquedo)
    {
        this.brinquedo = brinquedo;
    }

    public void mover()
    {
        if (brinquedo!=null)
            this.brinquedo.mover();
    }
}