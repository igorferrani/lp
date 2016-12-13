/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

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
public class Exemplo2Test {
    
    public Exemplo2Test() {
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
        if(content.contains("2100.5") && content.contains("101010"))
            assertEquals(true, true);
        else fail(content + " mas deveria ser 2100.5 101010");                     
    }
    
    @After
    public void tearDown() {
    }

   
    
}
