package Algorithms;

public class Great {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3756;
		int k=0;
		for (int a=i;a>1;a=a/10) {
			if(k<(a%10)) {
				k=a%10;
			}
		}
		System.out.println(k);

	}

}
