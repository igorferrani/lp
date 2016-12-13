/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import exercicio3.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felip
 */
public class Exemplo3Test {
    
    public Exemplo3Test() {
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
        Exemplo3.main(args);
        String content = outContent.toString();                
        assertEquals("11\r\n5\r\n24\r\n8\r\n", content);        
    }
    
    @After
    public void tearDown() {
    }

   
    
}
