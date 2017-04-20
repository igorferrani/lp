
package game;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author felipe
 */
public class Bola  extends Observavel implements Observador{
            
    Image image;
    int posX;
    int posY;
    int direcao = 1;
    
    public Bola(String pathImage, int posX, int posY){        
        this.posX = posX;
        this.posY = posY;
        try {
            image = new Image(pathImage);
        } catch (SlickException ex) {
            Logger.getLogger(Bola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getImage(){        
        return this.image;
    }
    public void render(){
        image.draw(this.posX, this.posY);
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    @Override
    public void update(Observavel ob) {
        moveBola((Raquete) ob);
    }
    
    public void moveBola(Raquete heroi){                        
        //aqui você precisa fazer a bola de movimentar de um lado para o outro...        
        //Como ? seu trabalho...
        //MOVIMENTO DA ESQUERDA PARA A DIREITA
        if(this.posX >= 640+20 && this.direcao == 1){
            //this.posX = -20; // reposiciona a bolinha -20 do ponto 0 zero
            this.direcao = -1;
            this.posY = ThreadLocalRandom.current().nextInt(0, 400);
        }
        else if(this.posX <= -50 && this.direcao == -1){
            this.direcao = 1;
            this.posY = ThreadLocalRandom.current().nextInt(0, 400);
        }
        
        //ThreadLocalRandom.current().nextInt(0, 400);
        //pega uma posicao randomica entre 0 e 400 já vimos em sala de aula.
        this.posY = 50;
        
        //if(this.posX <= 0 || this.posX >= 640)
        
        
        this.posX = this.posX + (this.direcao * 2);
    }
}
