import java.util.concurrent.ThreadLocalRandom;
/**
 * Escreva a descrição da classe Questao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Questao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int operando1;
    private int operando2;

    
    public Questao()
    {
        // inicializa variáveis de instância
        operando1 = ThreadLocalRandom.current().nextInt(0, 100);
        operando2 = ThreadLocalRandom.current().nextInt(0, 20);
    }

    
    public int getOperando1(){
        return operando1;
    }
    public int getOperando2(){
        return operando2;
    }
    

    public boolean verificaResposta(int resposta)
    {
        // ponha seu código aqui
        if (resposta == operando1 + operando2 )
            return true;
        else return false;
    }
}
