//******************************************************************************************
// Programming Projects 13.1 
// DVDListNode.java
// Ryan Gens
// Write a program consistent with the example in chapter 8 that maintains a DVD collection
// making use of a Linked List to store DVD objects.
//******************************************************************************************
public class DVDList {
	private DVDListNode list;
	private ListHeader header;
	
	//********************************************************************
	// Constructor --  Initializes the object.
	//********************************************************************
	public DVDList(){
		list = null;
		header = new ListHeader();
	}
	
	//********************************************************************
	// add --  Adds a DVD to the linked list.
	//********************************************************************
	public void add(DVD newDVD){
		DVDListNode DVDNode = new DVDListNode(newDVD);
		DVDListNode current;
		
		// If the header.front is not referencing any, initialize the 
		// header and list.
		if(header.front == null){
			list = DVDNode;
			header.front = list;
			header.count = 1;
		}
		else{
			current = list;
			header.count++;
			// Search the linked list for the end of the list.
			while (current.next != null)
				current = current.next;
			// Add the node to the end of the linked list.
			current.next = DVDNode;
		}
		// Set the last node in the linked list to DVDNode.
		header.rear = DVDNode;
	}
	
	//********************************************************************
	// print --  Print all the items in the linked list.
	//********************************************************************
	public void print(){
		DVDListNode current = header.front;
		
		if (current != null){
			System.out.println("The collection contains:");
			while (current != null){
				// Display the title of the DVD.
				System.out.println(current.dvd.toString());
				// Iterate through the linked list.
				current = current.next;
			};
		}
		else
			System.out.println("The DVD collection is empty.");
		System.out.println("");
	}
	
	//********************************************************************
	// removeDVD --  Removes the DVD matching the user input title.
	//********************************************************************
	public void removeDVD(String title){
		DVDListNode current;
		DVDListNode previous;
		previous = list;
		current = list;
		boolean found = false;
		
		if (current != null){
			while (!found){
				// If the user input title matches the title of the 
				// current Node's DVD title, assign the next pointer 
				// of the previous node the next pointer of the 
				// current node, and adjust the header pointers 
				// as necessary.
				if (current.dvd.getTitle().equals(title)){
					previous.next = current.next;
					found = true;
					if (current == header.front)
						header.front = previous.next;
					if(current == header.rear)
						header.rear = previous;
				}
				else{
					// Iterate through the linked list.
					if(current.next!=null){
						previous = current;
						current = current.next;
					}
					else{
						// If the title is not in the collection.
						System.out.println("The Item you are trying to delete is not in the collection.");
						System.out.println("");
						found = true;
					}
				}	
			}	
		}
		else	
			System.out.println("The collection is empty.");	
	}
	
	//********************************************************************
	// DVDListNode --  Creates a class the contains a DVD object and a 
	// pointer to the next node.
	//********************************************************************
	private class DVDListNode {
		public DVD dvd;
		public DVDListNode next;
	
		public DVDListNode(DVD newDVD){
			dvd = newDVD;
			next = null;
		}	
	}
	
	//********************************************************************
	// ListHeader --  Creates a class the contains pointers to the 
	// beginning and end of the linked list.
	//********************************************************************
	private class ListHeader{
		int count;
		public DVDListNode front, rear;
		
		public ListHeader(){
			front = null;
			rear = null;
		}
	}
}