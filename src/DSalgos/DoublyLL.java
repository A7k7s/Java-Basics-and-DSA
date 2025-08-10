package DSalgos;

public class DoublyLL{
	Dnode head=null;
	Dnode tail=null;
	void search(int posi) {
		if(head==null) {
			System.out.println("List empty");
			return;
		}
		Dnode current = head;
	    int i;
	    // Traverse to the node just before the desired position
	    for (i = 0; i < posi  && current != null; i++) {
	        current = current.next;
	    }
	    if(current==null) {
	    	System.out.println("position not found");
	    }else {
	    	System.out.println(current.data);
	    }
	}
	void delmiddle(int pos) {
		Dnode current=head;
		if (pos == 0) {
			head=head.next;
			head.prev=null;
	    }
	    int i;
	    for (i = 1; i < pos&& current!=null; i++) {
	        current = current.next;
	    }
	    if (current.next == tail) {
			tail=current;
			current.next=null;
	    } else {
	    	current.next=current.next.next;
	    	current.next.prev=current;
	    }
	}
	void delbegin(){
		Dnode current=head;
		if(head==null) {
			System.out.println("LinkedList empty");
		}else {
			current.next.prev=null;
			head=current.next;
		}
	}
	void delend() {
		Dnode current=tail;
		if(head==null) {
			System.out.println("LinkeList empty");
		}else {
			current.prev.next=null;
			tail=current.prev;
			
		}
	}
	void middle(int data,int position) {
		Dnode newnode=new Dnode(data);
		if (position == 0) {
	        newnode.next = head; // Point new node to the current head
	        head.prev = newnode; 
	        head=newnode;// Update head to the new node
	        return; // Exit the function
	    }
	    Dnode current = head;
	    int i;
	    // Traverse to the node just before the desired position
	    for (i = 1; i < position  && current != null; i++) {
	        current = current.next;
	    }
	    // Check if inserting at the tail
	    if (current == tail) {
	        tail.next=newnode;
	        newnode.prev=tail;
	        tail=newnode;
	    } else {
	    	newnode.prev = current;
	        newnode.next=current.next;
	        current.next.prev=newnode;
	        current.next=newnode;
	    }
	}
	void begin(int data) {
		Dnode newnode=new Dnode(data);
		if(head==null) {	
			head=newnode;
			tail=newnode;
		}else {
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	void end(int data) {
		Dnode newnode=new Dnode(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	    
	}
	void reverse() {
		Dnode current=tail;
		while(current.prev!=null) {
			System.out.print(current.data+"<->");
			current=current.prev;
		}System.out.print(current.data);
		System.out.println();
	}
	void display() {
		Dnode current=head;
		while(current.next!=null) {
			System.out.print(current.data+"<->");
			current=current.next;
		}System.out.print(current.data);
		System.out.println();
	}
}

