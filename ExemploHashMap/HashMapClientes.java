import java.util.HashMap;
import java.util.Iterator;

public class HashMapClientes
{
    HashMap hashMapClientes = new HashMap ();
    ArrayList listaClientes = new ArrayList();
    public void adicionaCliente(String nome, String dtNascimento, String identidade){
        Cliente novoCliente = new Cliente();
        novoCliente.nome = nome;
        novoCliente.identidade = identidade;
        novoCliente.dtNascimento = dtNascimento;
        hashMapClientes.put(novoCliente.nome , novoCliente);        
        listaClientes.add(novoCliente);
        
    }
    
    public Cliente pegarClientePorNome(String nome){
        Cliente buscaCliente = hashMapClientes.get(nome);
        return buscaCliente;
    }
    
    public Cliente pegarClientePorNomeArray(String nome){
        for(int i=0; i<= listaClientes.size();i++){
         Cliente buscaCliente = (Cliente)listaClientes.get(i);
         if(buscaCliente.nome.equalsIgnoreCase(nome)){
             return buscaCliente;
        }
        return null;
        
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
        
