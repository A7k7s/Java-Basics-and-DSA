package Algorithms;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    int flag;   
	    int count=0;
	    Scanner sc = new Scanner(System.in);  
	    n=sc.nextInt();
	    sc.close();    
	    for(int i = 2; i >1; i++){
	        flag = 0;
	        for(int j = 2; j < i; j++){ 
	            if(i % j == 0){
	                flag = 1;
	            }
	        }
	        if(flag==0) {
		        count++;
	        }
	        if(count==n) {
	        	System.out.println(n+"th prime no "+i);
	        	break;
	        }
	            
	    }
	}
}


