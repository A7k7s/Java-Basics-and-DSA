package CollectionFrameworks;
import java.util.HashMap;
import java.util.Collections;
public class ClassHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Akshayaa Panneerselvam";
		HashMap <Character,Integer> h= new HashMap<>();
		String st=s.toLowerCase();
		for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if(h.containsKey(ch)) {
            	h.put(ch,h.get(ch)+1);
            }else {
            	h.put(ch,1);
            }
                        
        }System.out.println(h);
        System.out.println("unique:");
        for (char c : h.keySet()) {
            if (h.get(c) == 1) {
                System.out.println(c);
            }
        }
        System.out.println("not unique:");
        for (char c : h.keySet()) {
            if (h.get(c) != 1) {
                System.out.println(c);
            }
        }
        System.out.println("most repeated");
        Integer n=Collections.max(h.values());
        for (char c : h.keySet()) {
            if (h.get(c) == n) {
                System.out.println(c);
            }
        }
		
	}

}
