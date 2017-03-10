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
    private QuestaoSoma questaoJogoSoma;
    private QuestaoMultiplicacao questaoJogoMultiplcacao;

    /**
     * COnstrutor para objetos da classe ControleJogo
     */
    public ControleJogo()
    {
    }        

    public void criaPerguntaMultiplicacao(){        
        questaoJogoMultiplcacao = new QuestaoMultiplicacao();
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Quando é: " + questaoJogoMultiplcacao.getOperando1() + " * "
        + questaoJogoMultiplcacao.getOperando2()));
        boolean testeResposta = questaoJogoMultiplcacao.verificaResposta(resposta);
        exibeResposta(testeResposta);
    }
    public void criaPerguntaSoma(){        
        questaoJogoSoma = new QuestaoSoma();
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Quando é: " + questaoJogoSoma.getOperando1() + " + "
        + questaoJogoSoma.getOperando2()));
        boolean testeResposta = questaoJogoSoma.verificaResposta(resposta);
        exibeResposta(testeResposta);
    }
    public void exibeResposta(boolean testeResposta){
        if(testeResposta)
            JOptionPane.showMessageDialog(null, "Você acertou!");
        else
            JOptionPane.showMessageDialog(null, "Você errou!");        
    }
}
