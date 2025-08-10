package Trees;

public class Node {
	int data;
	Node left;
	Node right;
	Node(int data){ //data here is local variable
		//this keyword is used to point instance variable
		this.data=data;
		left=null;
		right=null;
	}
}


