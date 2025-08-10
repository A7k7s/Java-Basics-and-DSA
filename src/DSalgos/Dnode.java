package DSalgos;

public class Dnode {
	int data;
	Dnode prev;
	Dnode next;
	Dnode(int data){ //data here is local variable
		//this keyword is used to point instance variable
		this.data=data;
		prev=null;
		next=null;
	}
}
