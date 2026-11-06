/*
Um carro possui as seguintes características:
 modelo;
 velocidade;
 aceleração;
 marcha.
O carro pode realizar as seguintes ações:
 ligar e desligar;
 acelerar e desacelerar;
 virar a direita e esquerda;
 marcha para cima e para baixo.
*/

public class Carro 
{
    private String modelo;

    private int marcha;
    
    private double velocidade;
    private double velocidadeMax;
    private double velocidadeMin;
    private double aceleracao;

    private boolean ligado;

    public Carro(String modelo, double aceleracao)
    {
        this.modelo = modelo;
        this.aceleracao = aceleracao;
        velocidade = 0.0;
        velocidadeMax = 0.0;
        velocidadeMin = 0.0;
        marcha = 0;
        ligado = false;
    }

    public void girarChave() 
    {
        if (ligado)
        {
            ligado = false;
            System.out.println(modelo + ": está desligado.");
        } else {
            ligado = true;
            System.out.println(modelo + ": está ligado.");
        }
    }

    public void acelerar() 
    {
        if (ligado) 
        {
            velocidade += aceleracao;
            
            if (velocidade > velocidadeMax) 
            {
                int marchaAnterior = marcha;
                marcha++;
                trocarMarcha(marchaAnterior);
            }

            System.out.println("Velocidade do " + modelo + ": " + velocidade);
        
        } else {
            System.out.println(modelo + ": ligue o carro primeiro.");
        }
    }

    public void desacelerar() 
    {
        if (ligado) 
        {
            velocidade -= aceleracao;
            
            if (velocidade < velocidadeMin) 
            {
                int marchaAnterior = marcha;
                marcha--;
                trocarMarcha(marchaAnterior);
            }

            System.out.println("Velocidade do " + modelo + ": " + velocidade);
        
        } else {
            System.out.println(modelo + ": ligue o carro primeiro.");
        }
    }
    
    public void girarVolanteDireita() 
    {
        System.out.println(modelo + ": virou à direta -->>");
    }
    
    public void girarVolanteEsquerda() 
    {
        System.out.println(modelo + ": virou à esquerda, companheiro <<--");
    }

    private void trocarMarcha(int marchaAnterior) 
    {
        if (marcha > 6 || marcha < -1)
        {
            System.out.println(modelo + ": voce nao pode trocar a marcha nessa direcao.");
            
            if (marcha > 6) marcha = 6;
            if (marcha < -1) marcha = -1;

        } else {
            System.out.println(modelo + ": trocando a marcha...");

            double escala = 0.0;

            if (marchaAnterior > marcha)
                escala = -20.0;
            else if (marchaAnterior < marcha)
                escala = 20.0;

            velocidadeMax += escala;
            velocidadeMin += escala;

            System.out.println("Marcha atual do modelo " + modelo + ": " + marcha);
            System.out.println("Nova faixa de velocidade da marcha: " + velocidadeMin + " km/h até " + velocidadeMax + " km/h");
        }
    }
}