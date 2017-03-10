
import javax.swing.*;
public class LeituraTeclado
{
    public void  leitura()
    {
        String resposta="";
        float nota1=0;float nota2=0;float media=0;   
        resposta = JOptionPane.showInputDialog("Entre com primeira nota: ");
        nota1 = Float.parseFloat(resposta);     
        resposta = JOptionPane.showInputDialog("Entre com segunda nota: ");
        nota2 = Float.parseFloat(resposta);                
        media = (nota1+nota2)/2;
        
        if(media>=6){
              JOptionPane.showMessageDialog(null, "Aprovado");              
        }else{
           JOptionPane.showMessageDialog(null, "Reprovado");              
        }
        
        
        
    }
}
