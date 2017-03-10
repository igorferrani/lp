
import java.util.ArrayList;
import javax.swing.*;
public class ControleContaCorrente
{
    private ArrayList<ContaCorrente> listaContas = new ArrayList<ContaCorrente>();
    
    public void  criaContaCorrente(int banco, int agencia, 
    int numeroConta,String nomeCompleto)
    {
      ContaCorrente conta= new ContaCorrente(banco,agencia,numeroConta,nomeCompleto);            
      listaContas.add(conta);
    }
}
