package muyasrasystem;


public class UserList {
	// head: reference variable to the first node of the list
    private User head;
    
    // CONSTRUCTORS
    public UserList() {
        head = null;
    }
	

	public boolean isEmpty() {
		return head == null;
	}
	
       public User findNode(int id, String pass) {
		return findNode(head, id,pass);
	}
	//
	// boolean | search(LLnode, int)
	//
	private User findNode(User p, int id,String pass) {
		User helpPtr = p;
		while (helpPtr != null) {
			if (helpPtr.getUserID()==id&&helpPtr.getPass().equals(pass) )
				return helpPtr;
			helpPtr = helpPtr.getNext();			
		}
		return null;
	}

//===================================================================================
        
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