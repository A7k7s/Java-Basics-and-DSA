package Algorithms;
import java.util.*;
import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int ord[]= {100,4,76,89,78,6};
		for(int k=ord.length;k>=0;k--) {
			boolean flag=false;
			for (int i=0;i<ord.length-1;i++) {
				int t=ord[i];	
				if(ord[i]>ord[i+1]) {
					ord[i]=ord[i+1];
					ord[i+1]=t;
					flag=true;
				}
			}if(!flag) {
				System.out.println(Arrays.toString(ord));
				System.out.println(ord[ord.length-n]);
				break;
			}	
		}sc.close();	
	}
}
