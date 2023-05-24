package muyasrasystem;

// LinkedList.java
// Author: Dr. Jonathan Cazalas
// 6/12/2013
// Class from which we can create fully functional Linked Lists


public class UserList {
	// head: reference variable to the first node of the list
    private User head;
    
    // CONSTRUCTORS
    public UserList() {
        head = null;
    }
	
	/* Below are MANY methods that are used on Linked Lists.
	 * 
	 * Examples:
	 * search, insert, delete, isEmpty, sumNodes, and many more
	 */
	
	//
	// boolean | isEmpty()
	//
	public boolean isEmpty() {
		return head == null;
	}
	
	
	//
	// boolean | search(int)
	//
	public boolean search(int data) {
		return search(head, data);
	}
	//
	// boolean | search(LLnode, int)
	//
	private boolean search(User p, int data) {
		User helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getUserID() == data)
				return true;
			helpPtr = helpPtr.getNext();			
		}
		return false;
	}
       public User findNode(int data) {
		return findNode(head, data);
	}
	//
	// boolean | search(LLnode, int)
	//
	private User findNode(User p, int data) {
		User helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getUserID() == data)
				return helpPtr;
			helpPtr = helpPtr.getNext();			
		}
		return null;
	}

	//
	// boolean | search(int)
	//
	
	
	
	//
	// void | PrintList()
	//
//	public void PrintList() {
//		PrintList(head);
//	}
//	//
//	// void | PrintList(LLnode)
//	//
//	private void PrintList(User head) {
//		// We need to traverse...so we need a help ptr
//		User helpPtr = head;
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
	// void | PrintList()
	//
//	public void ModifyAllNodes() {
//		ModifyAllNodes(head);
//	}
//	//
//	// void | PrintList(LLnode)
//	//
//	private void ModifyAllNodes(User head) {
//		// We need to traverse...so we need a help ptr
//		User helpPtr = head;
//		// Traverse to correct insertion point
//		while (helpPtr != null) {
//			// We add 10 to the data value of each node
//			helpPtr.setData(helpPtr.getData() + 10);
//			// Step one node over
//			helpPtr = helpPtr.getNext();
//		}
//	}
	
	
	//
	// int | sumNodes()
	//
//	public int sumNodes() {
//		return sumNodes(head);
//	}
//	//
//	// int | sumNodes(BSTnode)
//	//
//	private int sumNodes(User head) {
//		// We need to traverse...so we need a help ptr
//		User helpPtr = head;
//		int sum = 0; // counter
//		// Traverse to correct insertion point
//		while (helpPtr != null) {
//			// Increase sum
//			sum += helpPtr.getUserID();
//			// Step one node over
//			helpPtr = helpPtr.getNext();
//		}
//		return sum;
//	}
	
	
	//
	// void | insert(int)
	//
	public void insert(String name, int userID ,String pass, int age, String gender, String userType, int phoneNum) {
		head = insert(head, name, userID , pass,  age,  gender,  userType,  phoneNum);
	}
	//
	// LLnode | insert(LLnode, value)
	//
	private User insert(User head, String name, int userID ,String pass, int age, String gender, String userType, int phoneNum) {
		// IF there is no list, newNode will be the first node, so just return it
		if (head == null || head.getUserID() > userID) {
			head = new User(name, userID , pass,  age,  gender,  userType,  phoneNum, head);
			return head;
		}
		
		// ELSE, we have a list. Insert the new node at the correct location
		else {
			// We need to traverse to the correct insertion location...so we need a help ptr
			User helpPtr = head;
			// Traverse to correct insertion point
			while (helpPtr.getNext() != null) {
				if (helpPtr.getNext().getUserID()> userID)
					break; // we found our spot and should break out of the while loop
				helpPtr = helpPtr.getNext();
			}
			// Now make the new node. Set its next to point to the successor node.
			// And then make the predecessor node point to the new node
			User newNode = new User(name, userID , pass,  age,  gender,  userType,  phoneNum,helpPtr.getNext());
			helpPtr.setNext(newNode);
		}
		// Return head
		return head;
	}
	
	
	//
	// void | delete(int)
	//
	public void delete(int data) {
		head = delete(head, data);
	}
	//
	// LLnode | delete(LLnode, value)
	//
	private User delete(User head, int data) {
		// We can only delete if the list has nodes (is not empty)
		if (!isEmpty()) {
			// IF the first node (at the head) has the data value we are wanting to delete
			// we found it. Delete by skipping the node and making head point to the next node.
			if (head.getUserID() == data) {
				head = head.getNext();
			}
			// ELSE, the data is perhaps somewhere else in the list...so we must traverse and look for it
			else {
				// We need to traverse to find the data we want to delete...so we need a help ptr
				User helpPtr = head;
				// Traverse to correct deletion point
				while (helpPtr.getNext() != null) {
					if (helpPtr.getNext().getUserID()== data) {
						helpPtr.setNext(helpPtr.getNext().getNext());
						break; // we deleted the value and should break out of the while loop
					}
					helpPtr = helpPtr.getNext();
				}
			}
			// return the possibly updated head of the list
			return head;
		}
		return head;
	}
//        public int Data2ndNode(){
//            return Data2ndNode(head);
//        }
//        
//        private int Data2ndNode(User head){
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
//        private int TheLargest(User head){
//            User helpPtr=head;
//            int largest=0;
//            while(helpPtr != null){
//                if(helpPtr.getData()>largest){
//                    largest=helpPtr.getData();
//                }
//                helpPtr = helpPtr.getNext();
//            }
//            return largest;
//        }
        
//        public int Data2ndLastNode(){
//            return Data2ndLastNode(head);
//        }
//        
//        private int Data2ndLastNode(User head){
//            User helpPtr=head;
//            while(helpPtr.getNext().getNext()!=null){
//                helpPtr=helpPtr.getNext();
//            }
//            return helpPtr.getData();
//        }
//        public void DeleteLast(){
//            head=DeleteLast(head);
//        }
//        
//        private User DeleteLast(User head){
//           User helpPtr=head;
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
        
//        public int lastOne(){
//            return lastOne(head);
//        }
//        
//        private int lastOne(LLnode head){
//            LLnode helpPtr=head;
//            while(helpPtr.getNext()!=null){
//                helpPtr=helpPtr.getNext();
//            }
//            return helpPtr.getData();
//        
//        }
        
//        public void Odd2Even2Odd(){
//            Odd2Even2Odd(head);
//        }
//        
//        private void Odd2Even2Odd(User head){
//            User helpPtr=head;
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
       
 
    public User logIn(int userId, String pass) {
            return logIn(head, userId, pass);
	}
    public User logIn(User p,int userId, String pass) {
                User helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getUserID() == userId&&helpPtr.getPass().equals(pass))
				return helpPtr;
			helpPtr = helpPtr.getNext();			
		}
		return null;
	}
        
        
    
        
}