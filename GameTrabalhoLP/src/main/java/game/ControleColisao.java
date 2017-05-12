package game;

import java.awt.Rectangle;
import org.newdawn.slick.GameContainer;

/**
 *
 * 
 * Classe reponsavel por fazer o controle entre os objetos do jogo.
 * 
 */
public class ControleColisao  extends Colisao
{

    private Raquete raqueteDireita = null;
    private Raquete raqueteEsquerda = null;
    private Bola bola = null;
    private GameContainer controller;    
    
    public ControleColisao(GameContainer controller) 
    {
        this.controller = controller;        
    }
    
    //Esta classe é responsavel por tratar a colisão entre a bola e a raquete
    //Nela você deve colocar a lógica para rebater a bola..
    
    @Override    
    public void update(Observavel ob)
    {
        //esse metodo seta as informacoes de requete direita e a bola;
        //não remover esse metodo        
        if (this.raqueteDireita != null && this.raqueteEsquerda != null && this.bola != null) 
        {
            Rectangle first = new Rectangle(raqueteEsquerda.getPosX(), raqueteEsquerda.getPosY(),
                    raqueteEsquerda.getImage().getWidth() - 20, raqueteEsquerda.getImage().getHeight() - 20);
            Rectangle second = new Rectangle(bola.getPosX(), bola.getPosY(),
                    bola.getImage().getWidth() - 20, bola.getImage().getHeight() - 20);
            Rectangle third = new Rectangle(raqueteDireita.getPosX(), raqueteDireita.getPosY(),
                    raqueteDireita.getImage().getWidth() - 20, raqueteDireita.getImage().getHeight() - 20);
            
            // ao encosta na raquete direita
            if (first.intersects(second)) 
            { //controller.pause();
                bola.direcao = 1;
                System.out.print("Encostou raquete esquerda\nDireção: ");
                System.out.println(bola.direcao);
            }
            //ao encostar na raquete esquerda
            else if (third.intersects(second))
            {
                bola.direcao = -1;
                System.out.print("Encostou raquete direita\nDireção: ");
                System.out.println(bola.direcao);
            }
                /*
                 * bola rebater apos bater na raquete
                 */
        } 
        
    }    
    public void iniciaInformacoesRaqueteEBola(Observavel ob, int index)
    {        
        if (ob instanceof Raquete)
        {
            switch (index)
            {
                case 0:
                    this.raqueteEsquerda = (Raquete) ob;
                    break;
                case 1:
                    this.raqueteDireita = (Raquete) ob;
                    break;
            }
        }
        else if (ob instanceof Bola) 
            this.bola = (Bola) ob;
    }
}
