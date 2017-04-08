
package carrinhodecompras;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();        
    
    public void exibeMenu(){
        
         
        //peguntando ao usuario a quantidade de produtos que ele deseja cadastrar
        String quantidade = JOptionPane.showInputDialog("Informe a quantidade produtos:");
        //convertendo a quantidade de string para um inteiro
        int quant = Integer.parseInt(quantidade);        
        for(int indice=0; indice < quant;indice++){            
            //criando um objeto para armazenar um produto
            ProdutoComprado produto =new ProdutoComprado();                        
            //perguntando ao usuario o nome do produto que ele quer inserir 
            //carrinho de compras
            produto.nome = JOptionPane.showInputDialog("Nome do Produto:");
            //perguntando ao usuario a quantidade que ele quer inserir desse produto
            //carrinho de compras
            String qProduto;
            qProduto = JOptionPane.showInputDialog("Quantidade:");
            //convertendo uma string quantidade em um inteiro
            produto.quantidade = Integer.parseInt(qProduto);
            String qValor;
            //perguntando ao usuario qual o valor desse produto
            //carrinho de compras
            qValor = JOptionPane.showInputDialog("Valor:");
            //convertendo uma string quantidade em um float
            produto.valor = Float.parseFloat(qValor);
            //adicionando o produto ao carinho de compras
            carrinho.adicionarProduto(produto);                                    
        }                        
        exibeRemocaoProduto();                        
        //calculando o valor total dos itens que estao no carrinho 
        // e armazenando essas informacoes em total
        float total = carrinho.calculaTotal();
        JOptionPane.showMessageDialog(null, "Valor total da compra:" + total);
    }
    
    private void exibeRemocaoProduto(){                
            //perguntando ao usuario o nome do produto que ele quer remover
            String nome = JOptionPane.showInputDialog("Nome do Produto:");
            //perguntando ao usuario a quantidade que ele quer remover            
            String qProduto;
            qProduto = JOptionPane.showInputDialog("Quantidade:");
            int quantidade = Integer.parseInt(qProduto);            
            carrinho.removerProduto(nome, quantidade);                    
    }
    
    
}
