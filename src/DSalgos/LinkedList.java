package DSalgos;

public class LinkedList {
	int data;//instance
	LinkedList address;
	LinkedList(int data){ //data here is local variable
		//this keyword is used to point instance variable
		this.data=data;
		address=null;
	}
}

