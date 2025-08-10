package Trees;

public class Cque {
	Node arr[];
	int capacity,rear,front,size;
	Cque(int capacity){
		arr=new Node[capacity];
		this.capacity=capacity;
		rear=-1;
		front=0;
	}
	boolean isempty() {
		return size==0;
	}
	boolean isfull() {
		return size==capacity;
	}
	void add(Node obj) {
		if(isfull()) {
			System.out.println("Overflow");
			return;
		}rear=(rear+1)%capacity;
		arr[rear]=obj;
		size++;
	}
	Node deq() {
		if(isempty()) {
			System.out.println("Underflow");
			return null;
		}Node obj=arr[front];
		front++;
		size--;
		return obj;
	}
}
