
/**
 * Write a description of class Conta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conta
{
    // instance variables - replace the example below with your own
    private int numero;
    private int agencia;
    private String nomeCliente;
    private double saldo;
    private double limite;
   

    /**
     * Constructor for objects of class Conta
     */
    public Conta(int numero, int agencia, String nomeCliente, double saldo , double limite )
    {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.limite = limite;
        
    }

}
