package Algorithms;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="im a java programmer";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>=65 && ch<=90) {
				int j=ch+32;
				System.out.print((char)j);
			}else if(ch>=97&&ch<=122) {
				int j=ch-32;
				System.out.print((char)j);
			}
		}System.out.println();
		String []sp=name.split(" ");
		for(int i=0;i<sp.length;i++) {
			for(int j=0;j>=sp[i].length();j++) {
				System.out.print(name.charAt(j));
			}
		}
		
		
	}

}
