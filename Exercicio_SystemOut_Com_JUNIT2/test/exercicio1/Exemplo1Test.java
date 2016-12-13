
package exercicio1;

import exercicio2.Exemplo2;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Exemplo1Test {
    
    public Exemplo1Test() {
    }
    
     @BeforeClass
    public static void setUpClass() {
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    /**
     * Test of main method, of class MeuPrograma.
     */
    @Test
    public void testMain() {        
        String[] args = null;
        Exemplo2.main(args);
        String content = outContent.toString();
        content = content.replaceAll("\n" , "");
        content = content.replaceAll("\r" , "");
        content = content.replaceAll(" " , "");
        assertEquals("15 30 3.0 4.0 false", content);    
    }
    
    @After
    public void tearDown() {
    }

   
    
}
