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

public class secretaryTest {
    
    public secretaryTest() {
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

    @org.junit.Test
    public void testGetNome() {
        System.out.println("getNome");
        secretary instance = new secretary();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("");
    }
    
}