
package exercicio1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Exemplo1Test {
    
    public Exemplo1Test() {
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
    
    
    @Test
    public void testMultiplicaPorDois() {         
        int resultado = Exemplo1.multiplicaPorDois(10);
        assertEquals(resultado, 20);        
        resultado = Exemplo1.multiplicaPorDois(5);
        assertEquals(resultado, 10);                
        resultado = Exemplo1.multiplicaPorDois(15);
        assertEquals(resultado,30);         
    }
    
    @Test
    public void testMultiplicaPorDez() {         
        int resultado = Exemplo1.multiplicaPorDez(10);
        assertEquals(resultado, 100);        
        resultado = Exemplo1.multiplicaPorDez(5);
        assertEquals(resultado, 50);                
        resultado = Exemplo1.multiplicaPorDez(15);
        assertEquals(resultado,150);         
    }
    
    
}
