package Trees;

public class BinaryTree {
	Node root=null;
	static final int nodes=100;
	void insert(int data) {
		Node newnode=new Node(data);
		if(root==null) {
			root=newnode;
			return;
		}Cque Q=new Cque(nodes);
		Q.add(root);
		while(!Q.isempty()) {
			Node current=Q.deq();
			if(current.left==null) {
				current.left=newnode;
				return;
			}else {
				Q.add(current.left);
			}
			if(current.right==null) {
				current.right=newnode;
				return;
			}else {
				Q.add(current.right);
			}
		}
	}
	void delete(int val) {
		if(root==null) {
			System.out.println("Empty");
		}
		Node key = null,current = null,parent=null;
		Cque Q=new Cque(nodes);
		while(!Q.isempty()) {
			current=Q.deq();
			if(current.data==val) {
				key=current;
			}
			if(current.left!=null) {
				parent=current;
				Q.add(current.left);
			}
			if(current.right!=null) {
				parent=current;
				Q.add(current.right);
			}
		}
		if (key==null) {
			System.out.println("key notfound");
			return;
		}key.data=current.data;
		if(parent.right==current) {
			parent.right=null;
		}else {
			parent.left=null;
		}
		
	}
	public void inOrder(Node root) {

        if (root != null) {

            inOrder(root.left);

            System.out.print(root.data + " ");

            inOrder(root.right);

        }

    }




    public void inOrder() {

        System.out.print("In-order: ");

        inOrder(root);

        System.out.println();

    }




    // Pre-order Traversal (Root, Left, Right)

    public void preOrder(Node root) {

        if (root != null) {

            System.out.print(root.data + " ");

            preOrder(root.left);

            preOrder(root.right);

        }

    }




    public void preOrder() {

        System.out.print("Pre-order: ");

        preOrder(root);

        System.out.println();

    }




    // Post-order Traversal (Left, Right, Root)

    public void postOrder(Node root) {

        if (root != null) {

            postOrder(root.left);

            postOrder(root.right);

            System.out.print(root.data + " ");

        }

    }




    public void postOrder() {

        System.out.print("Post-order: ");

        postOrder(root);

        System.out.println();

    }
}
