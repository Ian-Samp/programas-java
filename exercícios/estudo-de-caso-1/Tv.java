/*
Uma televisão possui as seguintes características:
 tamanho de tela (em polegadas);
 volume: de 1 a 10 iniciando em 5 (somente no construtor);
 marca;
 voltagem (220 e 110);
 canal.
A televisão pode realizar as seguintes ações:
 ligar: ao ligar a televisão deve imprimir seu consumo. O
consumo deve ser definido pela voltagem multiplicada pela
quantidades de polegadas;
 desligar;
 aumentar e diminuir o volume;
 subir e descer canal.
*/

public class Tv {
    private double tela;

    private int volume;
    private int volt;
    private int canal;
    
    private String marca;

    private boolean ligada;

    public Tv(String marca, double tela, int volt) 
    {
        this.marca = marca;
        this.tela = tela;
        this.volt = volt;
        canal = 101;
        volume = 5;
        ligada = false;
    }

    public void botaoLigar()
    {
        if (ligada)
        {
            ligada = false;
            System.out.println(marca + ": está desligada.");
        } else {
            ligada = true;
            double consumo = tela * volt;
            System.out.println(marca + ": está ligada.");
            System.out.println("Consumo da TV " + marca + ": " + consumo + " Wh");
        }
    }

    // VOLUME
    public void subirVolume()
    {
        if (ligada)
        {
            if (volume <= 9)
            {
                volume += 1;
                System.out.println(marca + ": volume em " + volume);
            } else {
                System.out.println(marca + ": volume máximo");
            }
        } else {
            System.out.println(marca + ": está desligada.");
        }    
    }

    public void descerVolume()
    {
        if (ligada)
        {
            if (volume >= 2)
            {
                volume -= 1;
                System.out.println(marca + ": volume em " + volume);
            } else {
                System.out.println(marca + ": volume mínimo");
            }
        } else {
            System.out.println(marca + ": está desligada.");
        } 
    }

    // CANAL
    public void subirCanal()
    {
        if (ligada)
        {
            canal += 1;
            System.out.println("Canal atual da TV" + marca + ": " + canal);
        } else {
            System.out.println(marca + ": está desligada.");
        } 
    }

    public void descerCanal()
    {
        if (ligada)
        {
            canal -= 1;
            System.out.println("Canal atual da TV" + marca + ": " + canal);
        } else {
            System.out.println(marca + ": está desligada.");
        } 
    }
}