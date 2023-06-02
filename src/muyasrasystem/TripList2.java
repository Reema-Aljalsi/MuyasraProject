/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muyasrasystem;

/**
 *
 * @author hanee
 */
public class TripList2 {

    private Trip head;
    
    // CONSTRUCTORS
    public TripList2() {
        head = null;
    }
	
	/* Below are MANY methods that are used on Linked Lists.
	 * 
	 * Examples:
	 * RemoveTrip, insert, delete, isEmpty, sumNodes, and many more
	 */
	
	//
	// boolean | isEmpty()
	//
	public boolean isEmpty() {
		return head == null;
	}
	
	
	//
	// boolean | RemoveTrip(int)
	//
//	public boolean RemoveTrip(int data) {
//		return RemoveTrip(head, data);
//	}
//	//
//	// boolean | RemoveTrip(LLnode, int)
//	//
//	private boolean RemoveTrip(Trip p, int data) {
//		Trip helpPtr = p;
//		while (helpPtr != null) {
//			if (helpPtr.getTripID() == data)
//				return true;
//			helpPtr = helpPtr.getNext();			
//		}
//		return false;
//	}
        
        
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
                            helpPtr.getVistorID().add(idV);
                            // dec the number of chairs
                            helpPtr.setNumberOfChairs(helpPtr.getNumberOfChairs()-1);
                          
                            }
                        }
			helpPtr = helpPtr.getNext();			
		}
                
                System.out.println("the trip with the ID:" + helpPtr.getTripID()+"\n"
                +"departure at:"+helpPtr.getDeparture()+ "arrival at:" + helpPtr.getArrival() + "on date of:"+ helpPtr.getDate()+"\n"
                + "has been successfully booked");;
	}
        
        //remove trip
        public void RemoveTrip(int idT,int idV) {
                RemoveTrip(head, idT,idV);
	}
	
	private void RemoveTrip(Trip p, int idT,int idV) {
		Trip helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getTripID()== idT){
                            helpPtr.getVistorID().remove(idV);
                            }
			helpPtr = helpPtr.getNext();			
		}
                
                System.out.println("There is no trip with this id"+idT);;
	}

        
        
        //VistorNumber 
        public void VistorNumber(int idT) {
                VistorNumber(head, idT);
	}
	
	private void VistorNumber(Trip p, int idT) {
		Trip helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getTripID()== idT){
                           int vnum = helpPtr.getVistorID().size();
                            System.out.println("the total number of visitors in the"
                            + "trip with ID number" + helpPtr.getTripID() 
                            + "is: "+ vnum);
                            }
			helpPtr = helpPtr.getNext();			
		}
                  
	}



	//
	// boolean | RemoveTrip(int)
	//
	public Trip findNode(int data) {
		return findNode(head, data);
	}
	//
	// boolean | RemoveTrip(LLnode, int)
	//
	private Trip findNode(Trip p, int tripId) {
		Trip helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getTripID() == tripId)
				return helpPtr;
			helpPtr = helpPtr.getNext();			
		}
		return null;
	}
	
	public Trip AddTrip(int tripID, String date, String departure, String arrival , int numberOfChairs, String adminName, int adminID, boolean availability, int busID) {
		return head = AddTrip(head,tripID,date, departure, arrival ,numberOfChairs,adminName,adminID,availability,busID);
	}
	//
	// boolean | RemoveTrip(LLnode, int)
	//
	private Trip AddTrip(Trip p, int tripID, String date, String departure, String arrival, int numberOfChairs, String adminName, int adminID, boolean availability, int busID) {
                
                if (head == null) {
			head = new Trip(tripID,date,departure,arrival ,numberOfChairs,adminName,adminID,availability,busID);
			return head;
		}
                else {
			// We need to traverse to the correct insertion location...so we need a help ptr
			Trip helpPtr = p;
			// Traverse to correct insertion point
			while (helpPtr.getNext() != null) {// we found our spot and should break out of the while loop
				helpPtr = helpPtr.getNext();
			}
			// Now make the new node. Set its next to point to the successor node.
			// And then make the predecessor node point to the new node
			Trip newNode = new Trip(tripID,date,departure,arrival,numberOfChairs,adminName,adminID,availability,busID);
			helpPtr.setNext(newNode);
		}
		// Return head
		return head;
              
	}
	
	
//	//
//	// void | PrintList()
//	//
//	public void PrintList() {
//		PrintList(head);
//	}
//	//
//	// void | PrintList(LLnode)
//	//
//	private void PrintList(Trip head) {
//		// We need to traverse...so we need a help ptr
//		Trip helpPtr = head;
//		// Traverse to correct insertion point
//		while (helpPtr != null) {
//			// Print the data value of the node
//			System.out.print(helpPtr.getData() + ", ");
//			// Step one node over
//			helpPtr = helpPtr.getNext();
//		}
//		System.out.println();
//	}
//	
//	
//	//
//	// void | PrintList()
//	//
//	public void ModifyAllNodes() {
//		ModifyAllNodes(head);
//	}
//	//
//	// void | PrintList(LLnode)
//	//
//	private void ModifyAllNodes(Trip head) {
//		// We need to traverse...so we need a help ptr
//		Trip helpPtr = head;
//		// Traverse to correct insertion point
//		while (helpPtr != null) {
//			// We add 10 to the data value of each node
//			helpPtr.setData(helpPtr.getData() + 10);
//			// Step one node over
//			helpPtr = helpPtr.getNext();
//		}
//	}
//	
//	
//	//
//	// int | sumNodes()
//	//
//	public int sumNodes() {
//		return sumNodes(head);
//	}
//	//
//	// int | sumNodes(BSTnode)
//	//
//	private int sumNodes(Trip head) {
//		// We need to traverse...so we need a help ptr
//		Trip helpPtr = head;
//		int sum = 0; // counter
//		// Traverse to correct insertion point
//		while (helpPtr != null) {
//			// Increase sum
//			sum += helpPtr.getData();
//			// Step one node over
//			helpPtr = helpPtr.getNext();
//		}
//		return sum;
//	}
//	
//	
//	//
//	// void | insert(int)
//	//
//	public void insert(int data) {
//		head = insert(head, data);
//	}
//	//
//	// LLnode | insert(LLnode, value)
//	//
//	private Trip insert(Trip head, int data) {
//		// IF there is no list, newNode will be the first node, so just return it
//		if (head == null || head.getData() > data) {
//			head = new Trip(data, head);
//			return head;
//		}
//		
//		// ELSE, we have a list. Insert the new node at the correct location
//		else {
//			// We need to traverse to the correct insertion location...so we need a help ptr
//			Trip helpPtr = head;
//			// Traverse to correct insertion point
//			while (helpPtr.getNext() != null) {
//				if (helpPtr.getNext().getData() > data)
//					break; // we found our spot and should break out of the while loop
//				helpPtr = helpPtr.getNext();
//			}
//			// Now make the new node. Set its next to point to the successor node.
//			// And then make the predecessor node point to the new node
//			Trip newNode = new Trip(data, helpPtr.getNext());
//			helpPtr.setNext(newNode);
//		}
//		// Return head
//		return head;
//	}
//	
//	
//	//
//	// void | delete(int)
//	//
//	public void delete(int data) {
//		head = delete(head, data);
//	}
//	//
//	// LLnode | delete(LLnode, value)
//	//
//	private Trip delete(Trip head, int data) {
//		// We can only delete if the list has nodes (is not empty)
//		if (!isEmpty()) {
//			// IF the first node (at the head) has the data value we are wanting to delete
//			// we found it. Delete by skipping the node and making head point to the next node.
//			if (head.getData() == data) {
//				head = head.getNext();
//			}
//			// ELSE, the data is perhaps somewhere else in the list...so we must traverse and look for it
//			else {
//				// We need to traverse to find the data we want to delete...so we need a help ptr
//				Trip helpPtr = head;
//				// Traverse to correct deletion point
//				while (helpPtr.getNext() != null) {
//					if (helpPtr.getNext().getData() == data) {
//						helpPtr.setNext(helpPtr.getNext().getNext());
//						break; // we deleted the value and should break out of the while loop
//					}
//					helpPtr = helpPtr.getNext();
//				}
//			}
//			// return the possibly updated head of the list
//			return head;
//		}
//		return head;
//	}
//        public int Data2ndNode(){
//            return Data2ndNode(head);
//        }
//        
//        private int Data2ndNode(Trip head){
//            
//            if(head==null||head.getNext()==null){
//                return 0;
//            }else{
//                return head.getNext().getData();
//            }
//        }
//        
//        public int TheLargest(){
//            return TheLargest(head);
//        }
//        
//        private int TheLargest(Trip head){
//            Trip helpPtr=head;
//            int largest=0;
//            while(helpPtr != null){
//                if(helpPtr.getData()>largest){
//                    largest=helpPtr.getData();
//                }
//                helpPtr = helpPtr.getNext();
//            }
//            return largest;
//        }
//        
//        public int Data2ndLastNode(){
//            return Data2ndLastNode(head);
//        }
//        
//        private int Data2ndLastNode(Trip head){
//            Trip helpPtr=head;
//            while(helpPtr.getNext().getNext()!=null){
//                helpPtr=helpPtr.getNext();
//            }
//            return helpPtr.getData();
//        }
//        public void DeleteLast(){
//            head=DeleteLast(head);
//        }
//        
//        private Trip DeleteLast(Trip head){
//           Trip helpPtr=head;
//           
//           if(head.getNext()==null){
//                head=null;
//                return head;
//            }else{
//                
//                while(helpPtr.getNext().getNext()!=null){
//                    helpPtr=helpPtr.getNext();
//                }
//                helpPtr.setNext(null);
//                return head;
//           }
//        }
//        
//        public boolean ifItIsOne(){
//            return ifItIsOne(head);
//        }
//        
//        private boolean ifItIsOne(User head){
//           if(head.getNext()==null){
//                return true;
//            }else{
//               return false;
//           }
//        }
//        
//        public int lastOne(){
//            return lastOne(head);
//        }
//        
//        private int lastOne(Trip head){
//            Trip helpPtr=head;
//            while(helpPtr.getNext()!=null){
//                helpPtr=helpPtr.getNext();
//            }
//            return helpPtr.getData();
//        
//        }
//        
//        public void Odd2Even2Odd(){
//            Odd2Even2Odd(head);
//        }
//        
//        private void Odd2Even2Odd(Trip head){
//            Trip helpPtr=head;
//            while(helpPtr!=null){
//                if(helpPtr.getData()%2==0){
//                    helpPtr.setData(helpPtr.getData()+1);
//                }else{
//                    helpPtr.setData(helpPtr.getData()-1);
//                }
//                helpPtr=helpPtr.getNext();
//            }
//        }
//        
        
    //METHODS:
    //chairs is full???---> same as cheack avalibalsity: done in trip class
    /*
    علشان نقدر نتأكد لو مليان الفيستور محا يقدر يسجل 
    او في حالة لمن نجي نعرض الافايلبل تريب م تضهر لانها فلل
    */
    
    // ممكن ميثود تشيك على الافيلابيلتي حق التريب بحيث لو كانت الكراسي فلل
    //يغير الافايلبيلتي لفولس
    //cheack avilability of trip: done in trip class
    
    

        
}
  

