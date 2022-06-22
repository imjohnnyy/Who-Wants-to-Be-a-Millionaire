
package pdc_assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny Dong
 */

public class EndPointsTest {
    
    public EndPointsTest() {
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

    /**
     * Test of getBank method, of class EndPoints.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank");
        EndPoints instance = new EndPoints();
        int expResult = 0;
        int result = instance.getBank();
        assertEquals(expResult, result);

    }

    /**
     * Test of addBank method, of class EndPoints.
     */
    @Test
    public void testAddBank() {
        System.out.println("addBank");
        int round = 0;
        EndPoints instance = new EndPoints();
        int expResult = 100;
        int result = instance.addBank(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeBank method, of class EndPoints.
     */
    @Test
    public void testRemoveBank() {
        System.out.println("removeBank");
        int round = 0;
        EndPoints instance = new EndPoints();
        int expResult = 0;
        int result = instance.removeBank(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of exitPoints method, of class EndPoints.
     */
    @Test
    public void testExitPoints() {
        System.out.println("exitPoints");
        int round = 0;
        EndPoints instance = new EndPoints();
        instance.exitPoints(round);
 
    }

    /**
     * Test of endPoints method, of class EndPoints.
     */
    @Test
    public void testEndPoints() {
        System.out.println("endPoints");
        int round = 0;
        EndPoints instance = new EndPoints();
        instance.endPoints(round);

    }

    /**
     * Test of main method, of class EndPoints.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EndPoints.main(args);

    }
    
}
