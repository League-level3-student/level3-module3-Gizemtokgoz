package _01_StringBuilder;

import java.util.Iterator;

public class _03_StringBuilder {
	static StringBuilder builder = new StringBuilder();
    
    public static String append(String str, char[] characters) {
    	StringBuilder nsb = new StringBuilder(str);
    	for (int i = 0; i < characters.length; i++) {
    		nsb.append(characters[i]);
    		System.out.println("append ......: " + nsb);
		}
        return nsb.toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder nsb = new StringBuilder(str);
    	nsb.reverse();
        return nsb.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder nsb = new StringBuilder(str);
    	nsb.insert(index, newChar);
        return nsb.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder nsb = new StringBuilder(str);
    	nsb.delete(startIndex, endIndex);
    	return nsb.toString();
    }
}