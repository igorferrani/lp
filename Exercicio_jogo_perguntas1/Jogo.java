import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Esta classe cria um pergunta desafio para o jogador
 * @author Felipe 
 */
public class Jogo
{
    /**Construtor para objetos da classe Jogo*/
    public Jogo(){}       
    public void criaPergunta(){
        int operando1 = ThreadLocalRandom.current().nextInt(0, 100);
        int operando2 = ThreadLocalRandom.current().nextInt(0, 20);
        String resposta = JOptionPane.showInputDialog("Quando é: " + 
        operando1 + " + " + operando2 );
        int respostaInteira = Integer.parseInt(resposta);
        boolean testeResposta;
        if (respostaInteira == operando1 + operando2 )
            testeResposta = true;
        else testeResposta =  false;        
        if(testeResposta)
            JOptionPane.showMessageDialog(null, "Você acertou!", "Question",
            JOptionPane.QUESTION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Você errou!", "Question",
            JOptionPane.QUESTION_MESSAGE);
    }            
}
