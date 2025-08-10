package DSalgos;

public class Queue {
	LinkedList head=null;
	LinkedList tail=null;
	void add(int data) {
		LinkedList newnode=new LinkedList(data);
		if (head==null) {
			head=newnode;
			tail=newnode;
		}else {
			
		    tail.address=newnode;
		    tail=newnode;
		}
	    
	}
	void pop() {
		if(head==null) {
			System.out.println("Queue underflow");
			return;
		}
		LinkedList newnode=head.address;
		System.out.println(head.data);
		head=newnode;
	}
	void display() {
		LinkedList current=head;
		if(current==null) {
			System.out.println("Queue underflow");
			return;
		}
		while(current.address!=null) {
			System.out.print(current.data+"->");
			current=current.address;
		}System.out.print(current.data);
		System.out.println();
	}
}
