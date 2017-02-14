import javax.swing.*;
/**
 * Escreva a descrição da classe ControleJogo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ControleJogo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Questao questaoJogo;

    /**
     * COnstrutor para objetos da classe ControleJogo
     */
    public ControleJogo()
    {
        // inicializa variáveis de instância
                
    }
    
    
    public void criaPergunta(){
        
        questaoJogo = new Questao();
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Quando é: " + questaoJogo.getOperando1() + " + "
        + questaoJogo.getOperando2() ));
        boolean testeResposta = questaoJogo.verificaResposta(resposta);
        if(testeResposta)
            JOptionPane.showMessageDialog(null, "Você acertou!", "Question",JOptionPane.QUESTION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Você errou!", "Question",JOptionPane.QUESTION_MESSAGE);
    }
        

    
}
