
package game;
import java.util.ArrayList;
import java.util.List;
/**
 * @author felipe
 * Você não precisa mexer nessa classe
 */
public class Observavel  {

    List<Observador> observadores = new ArrayList();        
    public List<Observador> getMonitores() {
        return observadores;
    }
    public void addMonitores(Observador monitores) {
        this.observadores.add(monitores);
    }
    public void noificarTodos(){
        for(Observador ob : observadores ){
            ob.update(this);
        }
    }   
}
