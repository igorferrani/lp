
import javax.swing.*;
public class ComparacaoString
{
    public ComparacaoString(){}   
    public void exibeCustoFrete(){
        String cidade = JOptionPane.showInputDialog("Qual cidade?"+
        "(Vitória, Vila Velha ou Serra)"); 
        if(cidade.equalsIgnoreCase("Vitória")){
            JOptionPane.showMessageDialog(null, "Custo do frete é R$ 100,00");
        }
        else if(cidade.equalsIgnoreCase("Vila Velha")){
            JOptionPane.showMessageDialog(null, "Custo do frete é R$ 150,00");
        }
        else if(cidade.equalsIgnoreCase("Serra")){
            JOptionPane.showMessageDialog(null, "Custo do frete é R$ 50,00");
        }else{
            JOptionPane.showMessageDialog(null, "Cidade não encontrada");
        }
    }
}
