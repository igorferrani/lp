/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

/**
 *
 * @author felipe
 */
public class Usuario {
    //Vamos acresentar o email aqui.
    String login;
    String senha;    
    String nomeCompleto;
    String email;

    public String imprimeUsuario(){
        String dados ="Nome:" + nomeCompleto + "\n Login:" + login + "\n senha:" + senha+ "\n email:" + email;
        return dados;
    }
}
