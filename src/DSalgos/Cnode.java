package DSalgos;

public class Cnode {
	int data;//instance
	Cnode next;
	Cnode(int data){ //data here is local variable
		//this keyword is used to point instance variable
		this.data=data;
		next=null;
	}
}
