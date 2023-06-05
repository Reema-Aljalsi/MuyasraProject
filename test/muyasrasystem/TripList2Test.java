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
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of browseTrip method, of class TripList2.
     */
    @Test
    public void testBrowseTrip_Trip() {
        System.out.println("browseTrip");
        Trip head = null;
        TripList2 instance = new TripList2();
        //creat two node of trip
        //true --> print and display
        instance.AddTrip(210, "5/6" ,"jeddah","makkah", 24 , "ahmed", 12 , true, 5);
        Trip node=instance.findNode(210);
        //fase --> don't show 
        instance.AddTrip(211, "10/6" ,"jeddah","makkah", 24 , "mohammed", 12 , false, 5);
        Trip node2=instance.findNode(211);
        
        instance.browseTrip();
        //check the availability if it false will not be printed
        assertFalse(node2.checkAvailability());
        //check the availability if it true will  be printed
        assertTrue(node.checkAvailability());
    }

    /**
     * Test of bookTrip method, of class TripList2.
     */
    @Test
    public void testBookTrip() {
        System.out.println("bookTrip");
        //we have a trip that want to booking
        TripList2 trip = new TripList2();
        trip.AddTrip(200, "5/6" ,"jeddah","makkah", 1 , "ahmed", 12 , true, 5);
        Trip node= trip.findNode(200);
        
        //the user that will booking the trip 
        UserList user=new UserList();
        user.creatAccount("haneen", 210, "123", 20, "f", "visitor", 0500);
        User node2= user.findNode(210, "123");
                
        //for booking we need visitore id and trip id 
        trip.bookTrip(200,210);
        
        assertFalse(node.checkAvailability());
        
    }

    /**
     * Test of cancelTrip method, of class TripList2.
     */
    @Test
    public void testCancelTrip() {
        System.out.println("cancelTrip");
        TripList2 trip = new TripList2();
        trip.AddTrip(200, "5/6" ,"jeddah","makkah", 1 , "ahmed", 12 , true, 5);
        Trip node= trip.findNode(200);
        
        //the user that will booking the trip 
        UserList user=new UserList();
        user.creatAccount("haneen", 210, "123", 20, "f", "visitor", 0500);
        User node2= user.findNode(210, "123");
                
        //for booking we need visitore id and trip id 
        trip.bookTrip(200,210);
        
        trip.cancelTrip(200);
        
        assertTrue(node.checkAvailability());
     
    }

    /**
     * Test of VistorNumber method, of class TripList2.
     */
    @Test
    public void testVistorNumber() {
        System.out.println("VistorNumber");
        int idT = 0;
        TripList2 instance = new TripList2();
        instance.AddTrip(idT, "5/6" ,"jeddah","makkah", 24 , "admin",12 , true, 5);
        Trip t= instance.findNode(idT);
        t.setNumOfVistor(20);
        assertEquals(20, t.getNumOfVistor() );
        instance.VistorNumber(idT);
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


