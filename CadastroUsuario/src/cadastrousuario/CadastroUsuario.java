/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class CadastroUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
       String opcao = JOptionPane.showInputDialog("Escolha a opção"
                + "\n(1)criar usuário"
                + "\n(2)listar usuário JOptionPane"
                + "\n(3)listar usuário Console\n");                
             
        int opcaoEscolhida = Integer.parseInt(opcao);
        Listar listar = new Listar();
        if (opcaoEscolhida == 1){
            Usuario usuario = new Usuario();
            usuario.nomeCompleto = JOptionPane.showInputDialog("Nome completo:");
            usuario.login = JOptionPane.showInputDialog("Login:");
            usuario.senha = JOptionPane.showInputDialog("Senha:");            
            usuario.email = JOptionPane.showInputDialog("Email:");            
            ManipulaCSVUsuario.saveUsuario(usuario);
        }else if (opcaoEscolhida == 2){
            listar.listarJOptionPane();
        }else if (opcaoEscolhida == 3) {
            listar.listarConsole();
        }
        
    }
    
}
