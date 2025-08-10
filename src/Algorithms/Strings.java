package Algorithms;
import java.util.*;
public class Strings {
	boolean keyboard(String st) {
		String r1="qwertyuiopQWERTYUIOP";
		String r2="asdfghjklASDFGHJKL";
		String r3="zxcvbnmZXCVBNM";
		String l;
		char t=st.charAt(0);
		if(r1.contains(String.valueOf(t))){
			l=r1;
		}else if(r2.contains(String.valueOf(t))) {
			l=r2;
		}else {
			l=r3;
		}
		for(int i=1;i<st.length();i++) {
			char r=st.charAt(i);
			if(!(l.contains(String.valueOf(r)))) {
				return false;
			}
		}return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Peace";
		Strings k=new Strings();
		System.out.println(k.keyboard(st));
	

	}

}
