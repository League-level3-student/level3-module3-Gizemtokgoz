package _02_The_Wave;

import java.util.ArrayList;

public class _01_TheWave {
	/*
	 * Background: https://en.wikipedia.org/wiki/Wave_%28audience%29
	 * 
	 * Task: Your task is to create a function that turns a string into a Wave. You
	 * will be passed a string and you must return that string in an ArrayList where
	 * an uppercase letter is a person standing up. Example: wave("hello") =>
	 * "Hello", "hEllo", "heLlo", "helLo", "hellO"
	 * 
	 * 1. The input string will always be lower case but maybe empty. 2. If the
	 * character in the string is whitespace then pass over it as if it was an empty
	 * seat.
	 */

	public static ArrayList<String> wave(String str) {
		ArrayList<String> ral = new ArrayList();
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				String nstr = c[i] + "";
				c[i] = nstr.toUpperCase().charAt(0);
				String bstr = "";
				for (int j = 0; j < c.length; j++) {
					bstr += c[j];
				}
				ral.add(bstr);
				c = str.toCharArray();
			}
		}
		return ral;
	}
}
