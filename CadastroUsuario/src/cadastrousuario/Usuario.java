
package cadastrousuario;

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
