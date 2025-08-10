package Stacks;

import Queues.Arrayqueue;
import DSalgos.ArrayCDeque;
public class Mainrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCDeque st=new ArrayCDeque();
		st.addrear(7);
		st.addrear(0);
		st.addfront(9);
		st.addfront(1);
		st.addrear(8);
		st.poll();
		st.poll();
		st.polllast();
		st.poll();
		st.poll();
		st.polllast();
		
	}

}
