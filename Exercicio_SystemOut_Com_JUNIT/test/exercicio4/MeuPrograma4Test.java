
package exercicio4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MeuPrograma4Test {
    
    public MeuPrograma4Test() {
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
        exercicio4.MeuPrograma4.main(args);
        String content = outContent.toString();
        content = content.replaceAll("\n", "");
        assertEquals("Olá Mundo.Até logo.Estou de volta", content);    
    }    
}
