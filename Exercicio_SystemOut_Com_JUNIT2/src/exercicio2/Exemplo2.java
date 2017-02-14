
package exercicio2;


public class Exemplo2 {

    public static void main(String[] args) {
        
        System.out.println(calculaSalarioLiquido(2000));
        System.out.println(calculaSalarioLiquido(1500));
        System.out.println(calculaSalarioLiquido(900));        
        
    }
    
    public static double calculaSalarioLiquido(double salario){
        
        if(salario > 2000){
           salario  = salario - (salario * 0.2);
        }else if (salario > 1000){
            salario  = salario - (salario * 0.1);
        }else{
            salario  = salario - (salario * 0.05);
        }          
        return salario;
    }    

}
