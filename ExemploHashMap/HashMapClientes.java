import java.util.HashMap;
import java.util.Iterator;

public class HashMapClientes
{
    HashMap hashMapClientes = new HashMap ();
    public HashMapClientes()
    {
    }
    public void adicionaCliente(String nome, String dtNascimento, String identidade){
        Cliente novoCliente = new Cliente();
        novoCliente.nome = nome;
        novoCliente.identidade = identidade;
        novoCliente.dtNascimento = dtNascimento;
        hashMapClientes.put(novoCliente.nome , novoCliente);        
    }
    public void listarClientes(){
        
        if( hashMapClientes.keySet().size() == 0){
            System.out.println("Nenhum cliente Cadastrado\n");
        }        
        Iterator iteradorClientes  = hashMapClientes.keySet().iterator();
        while(iteradorClientes.hasNext()){
            String chave = (String)iteradorClientes.next();
            Cliente clienteListado = (Cliente)hashMapClientes.get(chave);
            System.out.println("************************\n");
            System.out.println("Nome:" + clienteListado.nome + "\n" +
            "Data Nascimento:" + clienteListado.dtNascimento+ "\n" + 
            "Identidade:" + clienteListado.identidade +"\n");
        }
    }
    public void removerCliente(String nome){
        hashMapClientes.remove(nome);
    }
        
}
        
