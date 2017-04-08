
package carrinhodecompras;

import java.util.HashMap;
import java.util.Iterator;

public class CarrinhoDeCompras {
            
    
    HashMap mapaProdutosComprados = new HashMap();        
    public void adicionarProduto(ProdutoComprado produto){        
        //verificando se existem esse nome de produto no hashmap
        if(mapaProdutosComprados.containsKey(produto.nome)){            
           ProdutoComprado p = (ProdutoComprado) mapaProdutosComprados.get(produto.nome);
           //aumentando a quantidade de um produto 
           produto.quantidade = p.quantidade + produto.quantidade;
           //atualizando um item no hashmap
           mapaProdutosComprados.put(produto.nome, produto);
        }
        else{                    
            //atualizando um item no hashmap
            mapaProdutosComprados.put(produto.nome , produto);
        }
    }        
    public void removerProduto(String nome, int quantidade){                
        //verificando se existem esse nome de produto no hashmap
        if(mapaProdutosComprados.containsKey(nome))
        {
           //pegando um item do hashmap
           ProdutoComprado p = (ProdutoComprado) mapaProdutosComprados.get(nome); 
           if(p.quantidade == quantidade){
               //removendo um item do hashmap dado o nome
               mapaProdutosComprados.remove(nome);
           }else{           
               //diminuindo a quantidade de um produto 
                p.quantidade = p.quantidade - quantidade;        
                //atualizando um item no hashmap
                mapaProdutosComprados.put(p.nome, p);    
           }
        }        
    }    
    public float calculaTotal(){        
        //variavel para acumular o valor total
        float total=0;        
        //iterando sobre o hashmap
        Iterator it = mapaProdutosComprados.keySet().iterator();
        //verificando se existe um proximo item
        while(it.hasNext()){
           //pegando um proximo objeto da lista
           String chave = (String) it.next();
           //pegando um objeto do hashmap dado uma chave
           ProdutoComprado p = (ProdutoComprado) mapaProdutosComprados.get(chave);
           //calculando o valor total de cada produto
           total +=p.quantidade*p.valor;           
        }
        //retornando o total
        return total;
    }
    
}
