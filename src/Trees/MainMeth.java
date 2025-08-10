package Trees;

public class MainMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree st=new BinaryTree();
		st.insert(10);
		st.insert(20);
		st.insert(70);
		st.insert(90);
		st.insert(80);
		st.postOrder();
		st.preOrder();
		st.inOrder();
	}

}
