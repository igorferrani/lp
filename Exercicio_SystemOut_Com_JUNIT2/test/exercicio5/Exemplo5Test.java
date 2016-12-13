/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import exercicio5.*;
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
public class Exemplo5Test {
    
    public Exemplo5Test() {
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
        Exemplo5.main(args);
        String content = outContent.toString();                
        assertEquals("false\r\ntrue\r\nfalse\r\n", content);        
    }
    
    @After
    public void tearDown() {
    }

   
    
}
