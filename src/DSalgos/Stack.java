package DSalgos;

public class Stack {
	LinkedList top=null;
	void size() {
		if(top==null) {
			System.out.println("stack underflow");
		}
		LinkedList current=top;
		int count=1;
		while(current.address!=null) {
			count++;
			current=current.address;
		}
		System.out.println("size "+count);
	}
	void push(int data) {
			LinkedList newnode=new LinkedList(data);
			newnode.address=top;
			top=newnode;
			System.out.println(data +" pushed successfully");
	}
	void pop() {
		if(top==null) {
			System.out.println("stack underflow");
		}else {
			int p=top.data;
			LinkedList newnode=top.address;
			top=newnode;
			System.out.println(p+" poped successfully");
		}
	}
	void peek() {
		if(top==null) {
			System.out.println("stack underflow");
		}else {
			System.out.println("the top element "+top.data);
		}
	}
	void display() {
		LinkedList current=top;
		if(current==null) {
			System.out.println("stack underflow");
		}else {
			while(current.address!=null) {
				System.out.print(current.data+"->");
				current=current.address;
			}System.out.print(current.data);
			System.out.println();
		}
		
	}

}
