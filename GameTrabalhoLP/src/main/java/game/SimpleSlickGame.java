package game;

/**
 *
 * @author felipe
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import java.io.*;

public class SimpleSlickGame extends BasicGame {
    private int timeCount = 0;    
    private Image land;
    private Bola bola;
    private Image gameover;
    private Image ganhouJogo;

    boolean ganhou=false;
    int time;
  
    Raquete raqueteDireita;
    Raquete raqueteEsquerda;

    public SimpleSlickGame(String gamename) {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
        try {
            File file = new File(".");
            String filePath = file.getCanonicalPath();
            land = new Image(filePath + "\\src\\main\\java\\quadra.jpg");
            raqueteDireita = new Raquete(filePath + "\\src\\main\\java\\raquete.png", 640-100, 240-50);
            raqueteEsquerda = new Raquete(filePath + "\\src\\main\\java\\raquete.png", 0, 240-50);
            
            bola = new Bola(filePath + "\\src\\main\\java\\bola.png", 500, -100);
            gameover = new Image(filePath + "\\src\\main\\java\\gameover.png");
            ganhouJogo = new Image(filePath + "\\src\\main\\java\\ganhou.png");

            
            raqueteDireita.addMonitores(bola);
            raqueteEsquerda.addMonitores(bola);
            
            ControleColisao controleColisao = new ControleColisao(gc);
            raqueteDireita.addMonitores(controleColisao);
            raqueteEsquerda.addMonitores(controleColisao);
            bola.addMonitores(controleColisao);
            
        } catch (IOException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.drawImage(land, 0, 0);
        g.drawString("Time : " + time/1000, 530, 20);
        raqueteDireita.render();
        raqueteEsquerda.render();
        bola.render(); 
       
        //limita o tempo do jogo em 100 segundos...
        if(time/1000 >= 100){
            gc.pause();
            ganhouJogo.draw(200,200);
        }
        
        if(gc.isPaused())
            gameover.draw(200,200);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);            
            appgc.start();
        } catch (SlickException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {        
        if(!gc.isPaused()){
            time += i;

            //aqui você precisar fazer a raquete da esquerda se movimentar também 
            //para isso utilize, por exemplo, a letra "a" para esquerda, "d" para direita
            //"w" para ir para cima e "s" para ir para baixo.

           Input input = gc.getInput();
           if (input.isKeyDown(Input.KEY_W))
               if(this.raqueteEsquerda.getPosY() > 0)
                   this.raqueteEsquerda.setPosY(this.raqueteEsquerda.getPosY() - 2);        
           if (input.isKeyDown(Input.KEY_S)) 
               if(this.raqueteEsquerda.getPosY() < 480 - raqueteEsquerda.getImage().getHeight())
                   this.raqueteEsquerda.setPosY(this.raqueteEsquerda.getPosY() + 2);        
           if (input.isKeyDown(Input.KEY_A)) 
               if(this.raqueteEsquerda.getPosX() > 0)
                   this.raqueteEsquerda.setPosX(this.raqueteEsquerda.getPosX() - 2);        
           if (input.isKeyDown(Input.KEY_D))
               if(this.raqueteEsquerda.getPosX() < (640/2) - raqueteEsquerda.getImage().getWidth())
                   this.raqueteEsquerda.setPosX(this.raqueteEsquerda.getPosX() + 2);
           
           
           
           if (input.isKeyDown(Input.KEY_UP))
               if(this.raqueteDireita.getPosY() > 0)
                   this.raqueteDireita.setPosY(this.raqueteDireita.getPosY() - 2);        
           if (input.isKeyDown(Input.KEY_DOWN)) 
               if(this.raqueteDireita.getPosY() < 480 - raqueteDireita.getImage().getHeight())
                   this.raqueteDireita.setPosY(this.raqueteDireita.getPosY() + 2);        
           if (input.isKeyDown(Input.KEY_LEFT)) 
               if(this.raqueteDireita.getPosX() > (640/2))
                   this.raqueteDireita.setPosX(this.raqueteDireita.getPosX() - 2);
           if (input.isKeyDown(Input.KEY_RIGHT))
               if(this.raqueteDireita.getPosX() < 640 - raqueteDireita.getImage().getWidth())
                   this.raqueteDireita.setPosX(this.raqueteDireita.getPosX() + 2);

        
            timeCount++;
            if (timeCount == 10){ 
                raqueteDireita.noificarTodos();
                raqueteEsquerda.noificarTodos();
                bola.noificarTodos();
                timeCount=0;
            }
        }
        
    }
}
