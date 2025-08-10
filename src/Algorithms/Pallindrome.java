package Algorithms;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k=0;
		int rev=0;
		for (int a=n;a>1;a=a/10) {
			k=(a%10);
			rev=rev*10+k;
			
		}
		if(n==rev) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not pallindrome");
		}sc.close();

	}

}
