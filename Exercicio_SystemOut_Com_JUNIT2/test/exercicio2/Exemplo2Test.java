
package exercicio2;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author felip
 */
public class Exemplo2Test {
    
    public Exemplo2Test() {
    }
    
     @BeforeClass
    public static void setUpClass() {
    }


    @Before
    public void setUpStreams() {
    }

    @After
    public void cleanUpStreams() {
    }

    /**
     * Test of main method, of class MeuPrograma.
     */
    @Test
    public void testMain() { 
        
        double resultado = Exemplo2.calculaSalarioLiquido(2000);
        assertEquals(resultado, 1800, 0.01);  
        resultado = Exemplo2.calculaSalarioLiquido(4000);
        assertEquals(resultado, 3200,0.01);  
        resultado = Exemplo2.calculaSalarioLiquido(8000);
        assertEquals(resultado, 6400,0.01);  
        resultado = Exemplo2.calculaSalarioLiquido(1000);       
        assertEquals(resultado, 950, 0.01);  
        resultado = Exemplo2.calculaSalarioLiquido(800);
        assertEquals(resultado, 760, 0.01); 
    }
    
    @After
    public void tearDown() {
    }

   
    
}
