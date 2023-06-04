package muyasrasystem;

public class TripList2 {
    private Trip head;
    
    // CONSTRUCTORS
    public TripList2() {
        head = null;
    }
	
//==============================================================================
//                                 IS EMPTY                                
//==============================================================================
    
	// boolean | isEmpty()
	public boolean isEmpty() {
		return head == null;
	}

//==============================================================================
//                                BROWSE TRIP                               
//==============================================================================
        
        //browse trip
        public void browseTrip() {
            browseTrip(head);
	}
        
        private void browseTrip(Trip head) {
            Trip helpPtr = head;
            System.out.println("--------------TRIPS--------------");
            while (helpPtr != null) {
                //check availabilty
                if(helpPtr.checkAvailability()){
                    //print all information of the trip 
                    System.out.println("Trip ID is:"+helpPtr.getTripID());
                    System.out.println("Trip Date:"+helpPtr.getDate());
                    System.out.println("departure at:"+helpPtr.getDeparture());
                    System.out.println("Arrival at:"+helpPtr.getArrival());
                    System.out.println("Availability:"+helpPtr.isAvailability());
                    System.out.println("Bus ID is:"+helpPtr.getBusID());
                    System.out.println("----------------------------------");
                }   
                helpPtr = helpPtr.getNext();
            }
            System.out.println("==================================");
        }

//==============================================================================
//                              BOOKING TRIP                                
//==============================================================================
        
        //book trip
        public void bookTrip(int idT,int idV) {
            bookTrip(head, idT,idV);
	}
	
	private void bookTrip(Trip p, int idT,int idV) {
            Trip helpPtr = p;
            
            while (helpPtr != null) {
                //search for trip
		if (helpPtr.getTripID()== idT){
                    //cheack avalibality is true
                    if(helpPtr.checkAvailability()){
                        //add visitor id
                        
                        helpPtr.setNumOfVistor(helpPtr.getNumOfVistor()+1);
                        // dec the number of chairs
                        helpPtr.setNumberOfChairs(helpPtr.getNumberOfChairs()-1);
                        getTecket(helpPtr);
                    }   
                }
                
                helpPtr = helpPtr.getNext();			
            }
            //get tecket
            
        }
        
//==============================================================================
//                                GET TECKET                                
//==============================================================================
        
        private void getTecket(Trip trip) {
        System.out.println("--------------TECKET--------------");
            System.out.println("the trip with the ID:" + trip.getTripID());
            System.out.println("departure at:"+trip.getDeparture());
            System.out.println("arrival at:" + trip.getArrival());
            System.out.println("on date of:"+ trip.getDate());
            System.out.println("---has been successfully booked---");
    }
        
//==============================================================================
//                              CANCEL TRIP                                
//==============================================================================
        
        //remove visitor from trip
        public void cancelTrip(int idT) {
                cancelTrip(head, idT);
	}
	
	private void cancelTrip(Trip p, int idT) {
            Trip helpPtr = p;
            while (helpPtr != null) {
                if (helpPtr.getTripID()== idT){
                    if(p.getNumOfVistor()==0){
                        System.out.println("There is no visitor in This Trip!");
                    }else{
                        helpPtr.setNumOfVistor(helpPtr.getNumOfVistor()-1);
                        helpPtr.setNumberOfChairs(helpPtr.getNumberOfChairs()+1);
                        System.out.println("cancel Trip successfully");
                    }
                }
	    helpPtr = helpPtr.getNext();		
            }
        }
        
//==============================================================================
//                             VISITOR NUMBER                                
//==============================================================================

        //VistorNumber 
        public void VistorNumber(int idT) {
                VistorNumber(head, idT);
	}
	
	private void VistorNumber(Trip p, int idT) {
            Trip helpPtr = p;
            while (helpPtr != null) {
		if (helpPtr.getTripID()== idT){
                    if(p.getNumOfVistor()==0){
                        System.out.println("There is no visitor in This Trip!");
                    }else{
                        System.out.println("the total number of visitors in the "
                        +"trip with ID number" + helpPtr.getTripID()+"is: "+ p.getNumOfVistor());
                    }
                }
		helpPtr = helpPtr.getNext();			
            }
        }
        
//==============================================================================
//                                FIND NODE                                
//==============================================================================

	public Trip findNode(int data) {
		return findNode(head, data);
	}
	
	private Trip findNode(Trip p, int tripId) {
		Trip helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getTripID() == tripId)
				return helpPtr;
			helpPtr = helpPtr.getNext();			
		}
		return null;
	}
	
//==============================================================================
//                                  ADD TRIP                               
//==============================================================================
        
	public Trip AddTrip(int tripID, String date, String departure, String arrival,
        int numberOfChairs, String adminName, int adminID, boolean availability, int busID){
            
        //---------------------------------------------------------------------------
            return head = AddTrip(head, tripID,date, departure, arrival,numberOfChairs,
            adminName,adminID,availability,busID);
	}
        //
        //
        private Trip AddTrip(Trip p, int tripID, String date, String departure, String arrival, 
        int numberOfChairs, String adminName, int adminID, boolean availability, int busID) {
                
        //---------------------------------------------------------------------------
            if (head == null) {
		head = new Trip(tripID,date,departure,arrival ,numberOfChairs,
                adminName,adminID,availability,busID);
		return head;
                
            }else{
                // We need to traverse to the correct insertion location...so we need a help ptr
                Trip helpPtr = p;
                    
                // Traverse to correct insertion point
                while (helpPtr.getNext() != null) {// we found our spot and should break out of the while loop
                    helpPtr = helpPtr.getNext();
                }
                    
                // Now make the new node. Set its next to point to the successor node.
                // And then make the predecessor node point to the new node
                Trip newNode = new Trip(tripID,date,departure,arrival,numberOfChairs,
                adminName,adminID,availability,busID);
                helpPtr.setNext(newNode);
            }
            
            // Return head
            return head;
        }
}
  

