/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muyasrasystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reema
 */
public class TripList2Test {
    
    public TripList2Test() {
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
     * Test of isEmpty method, of class TripList2.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        TripList2 instance = new TripList2();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of browseTrip method, of class TripList2.
     */
    @Test
    public void testBrowseTrip_Trip() {
        System.out.println("browseTrip");
        Trip head = null;
        TripList2 instance = new TripList2();
        instance.browseTrip(head);
    }

    /**
     * Test of bookTrip method, of class TripList2.
     */
    @Test
    public void testBookTrip() {
        System.out.println("bookTrip");
        int idT = 0;
        int idV = 0;
        TripList2 instance = new TripList2();
        instance.bookTrip(idT, idV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelTrip method, of class TripList2.
     */
    @Test
    public void testCancelTrip() {
        System.out.println("cancelTrip");
        int idT = 0;
        TripList2 instance = new TripList2();
        instance.cancelTrip(idT);
      
    }

    /**
     * Test of VistorNumber method, of class TripList2.
     */
    @Test
    public void testVistorNumber() {
        System.out.println("VistorNumber");
        int idT = 0;
        TripList2 instance = new TripList2();
        instance.VistorNumber(idT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNode method, of class TripList2.
     */
    @Test
    public void testFindNode() {
        System.out.println("findNode");
        int data = 0;
        TripList2 instance = new TripList2();
        Trip expResult = null;
        Trip result = instance.findNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddTrip method, of class TripList2.
     */
    @Test
    public void testAddTrip() {
       System.out.println("AddTrip");
        int tripID = 1;
        String date = "03/06/23";
        String departure = "JEDDAH";
        String arrival = "MECCA";
        int numberOfChairs = 25;
        String adminName = "Ahmad";
        int adminID = 1627434;
        boolean availability = true;
        int busID = 12;
        TripList2 instance = new TripList2();
        Trip result = instance.AddTrip(tripID, date, departure, arrival, numberOfChairs, adminName, adminID, availability, busID);
        Trip expResult = instance.findNode(1);
        
        assertSame(expResult, result);
    }
    
}
