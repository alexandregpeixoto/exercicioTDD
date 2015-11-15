package examerotina;

/**
 *
 * @author Alexandre
 * http://junit.sourceforge.net/javadoc/org/junit/After.html
 * http://junit.sourceforge.net/javadoc/org/junit/AfterClass.html
 * http://junit.sourceforge.net/javadoc/org/junit/Before.html
 * http://junit.sourceforge.net/javadoc/org/junit/BeforeClass.html
 * 
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class dogTest {
    
    public dogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetEspecie() {
        System.out.println("getEspecie");
        dog instance = new dog();
        String expResult = "";
        String result = instance.getEspecie();
        assertEquals(expResult, result);
        fail("");
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        dog instance = new dog();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("");
    }
    
}