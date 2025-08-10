package DSalgos;

public class CirSingly {
	Cnode head=null;
	void end(int data) {
		Cnode newnode=new Cnode(data);
		if(head==null) {
			head=newnode;
			newnode.next=head;
			return;
		}else {
			Cnode current=head;
			while(current.next!=head) {
				current=current.next;
			}current.next=newnode;
			newnode.next=head;
		}
	}
	void delend() {
		Cnode current=head;
		while(current.next.next!=head) {
			current=current.next;
		}current.next=head;
		System.out.println("");
	}
	void delbegin(){
		Cnode current=head;
		while(current.next!=head) {
			current=current.next;
		}current.next=head.next;
		head=current.next;
		System.out.println("");
	}
	void begin(int data) {
		Cnode newnode=new Cnode(data);
		if(head==null) {
			head=newnode;
			newnode.next=head;
			return;
		}else {
			Cnode current=head;
			while(current.next!=head) {
				current=current.next;
			}current.next=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	void middle(int data, int position) {
	    Cnode newnode = new Cnode(data);
	    if (position == 0) {
	    	Cnode current=head;
			while(current.next!=head) {
				current=current.next;
			}current.next=newnode;
			newnode.next=head;
			head=newnode;
	        return; // 
	    }
	    Cnode current = head;
	    int i;
	    // Traverse to the node just before the desired position
	    for (i = 1; i < position  && current.next != head; i++) {
	        current = current.next;
	    }
	    // Check if inserting at the tail
	    if (current.next == head) {
	    	while(current.next!=head) {
				current=current.next;
			}current.next=newnode;
			newnode.next=head;
	    } else {
	    	newnode.next = current.next; 
	        current.next = newnode;
	    }
	}
	void display() {
		if(head==null) {
			System.out.println("List empty");
		}
		Cnode current=head;
		while(current.next!=head) {
			System.out.print(current.data+"->");
			current=current.next;
		}System.out.print(current.data);
	}
}
