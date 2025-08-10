package DSalgos;
public class SinglyLL {
	LinkedList head=null;
	void sort() {
	    LinkedList current = head;
	    while (current != null) {
	        LinkedList sortt = current;
	        LinkedList select = current.address;
	        while (select != null) {
	            if (select.data < sortt.data) {
	                // Swap the data between sortt and select
	                int temp = sortt.data;
	                sortt.data = select.data;
	                select.data = temp;
	            }
	            select = select.address;
	        }
	        current = current.address;
	    }
	}
	
	//rotate right
	void rotright(int number) {
		for(int i=0;i<number;i++) {
			LinkedList current=head;
			while(current.address.address!=null) {
				current=current.address;
			}LinkedList temp=current.address;
			current.address=null;
			temp.address=head;
			head=temp;
		}
		
	}
	//searching in linked list
	void search(int data) {
		LinkedList current=head;
		int posi=0;
		while(current.data!=data) {
			current=current.address;
			posi++;
		}System.out.println(data+" present in position "+posi);
		System.out.println();
	}
	//delete at the middle with position
	void delmiddle(int position) {
		LinkedList current=head;
		if (position==0) {
			head=current.address;
		}
		for(int i=1;i<position;i++) {
			current=current.address;
		}current.address=current.address.address;
	}
	//insert at middle with position
	void middle(int data, int position) {
	    LinkedList newnode = new LinkedList(data);
	    // Check if inserting at the head
	    if (position == 0) {
	        newnode.address = head; // Point new node to the current head
	        head = newnode; // Update head to the new node
	        return; // Exit the function
	    }
	    LinkedList current = head;
	    int i;
	    // Traverse to the node just before the desired position
	    for (i = 1; i < position  && current != null; i++) {
	        current = current.address;
	    }
	    // Check if inserting at the tail
	    if (current == null) {
	        System.out.println("index pout bound");
	    } else {
	        // Insert the new node in the middle
	        newnode.address = current.address; // Link new node to the next node
	        current.address = newnode; // Link current node to the new node
	    }
	}

	//insert at begin
	void begin(int data) {
		LinkedList newnode=new LinkedList(data);
		newnode.address=head;
		head=newnode;
	}
	//insert at end
	void end(int data) {
		LinkedList newnode=new LinkedList(data);
	    LinkedList current=head;
	    while(current.address!=null) {
	    	current=current.address;
	    }current.address=newnode;
	}
	//delete end
	void delend() {
		LinkedList current=head;
		while (current.address.address!=null) {
			current=current.address;
		}current.address=null;
	}
	//delete begin
	void delbegin() {
		LinkedList newnode=head.address;
		head=newnode;
	}
	//display
	void display() {
		LinkedList current=head;
		while(current.address!=null) {
			System.out.print(current.data+"->");
			current=current.address;
		}System.out.print(current.data);
		System.out.println();
	}
}
