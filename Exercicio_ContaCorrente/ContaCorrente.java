
/**
 * Write a description of class ContaCorrente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContaCorrente
{
    private int numeroConta;
    private int agencia;
    private int banco;
    private double saldo;
    String nomeCorrentista;
    public ContaCorrente(int banco, agencia, numeroConta, 
    String nomeCorrentista)
    {
        this.saldo = 0;        
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;        
    }
    public realizarSaque(double valor){
        this.saldo = this.saldo - valor;
    }    
    public realizarDeposito(double valor){
        this.saldo = this.saldo + valor;
    }
}

