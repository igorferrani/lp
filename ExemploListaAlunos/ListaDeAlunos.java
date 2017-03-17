import java.util.ArrayList;
import javax.swing.*;
public class ListaDeAlunos
{
    private ArrayList<String> listaAlunos= new ArrayList<String>();    
    public void  listaDeAlunos()
    {
        String resposta="";
        int quantidadeAlunos;   
        resposta = JOptionPane.showInputDialog("Quantidade de Alunos da lista:");
        quantidadeAlunos = Integer.parseInt(resposta);             
        for(int numeroAlunos=0; numeroAlunos<=quantidadeAlunos;numeroAlunos++){
            resposta = JOptionPane.showInputDialog("Informe o nome do aluno:");            
            listaAlunos.add(resposta);
        }
        for(int numeroAlunos=0; numeroAlunos<=listaAlunos.size();numeroAlunos++){
            JOptionPane.showMessageDialog(null, 
            "Nome do aluno:" + listaAlunos.get(numeroAlunos));                       
        }
    }
}
