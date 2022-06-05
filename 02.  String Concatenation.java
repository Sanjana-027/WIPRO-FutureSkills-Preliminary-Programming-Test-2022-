package exam;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		String input1 = "apple";
		String input2 = "orange";
		
		System.out.println(stringConcat(input1, input2));

	}
	
	public static String stringConcat(String input1, String input2) {
		if (input1.length() == 0 || input2.length() == 0) {
			return null;
		}
		String concat = input1 + input2;
		String ans = "";
		char[] al = concat.toCharArray();
		Arrays.sort(al);
		for(int i =  al.length - 1; i >= 1; i--) {
			if(al[i] != al[i - 1] && al[i] != ' ') {
				ans += al[i];
			}
		}
		
		return ans + al[0];
	}

}
