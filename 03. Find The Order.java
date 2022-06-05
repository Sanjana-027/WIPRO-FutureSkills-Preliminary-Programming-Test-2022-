package exam;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		String input1 = "dca";
		String input2 = "CAZa";
		System.out.println(findOrder(input1, input2));

	}

	public static String findOrder(String input1, String input2) {
		String ans = "";
		int count = 0;
		char[] input1Arr = input1.toCharArray();
		Arrays.sort(input1Arr);
		
		String input1Asc = "", input1Desc = "";

		boolean asc = true, desc = true;
		for (int i = 0; i < input1.length(); i++) {
//			if (input1.charAt(i) != input1Arr[i]) {
//				asc = false;
//				break;
//			}
			input1Asc += input1Arr[i];
		}
		for (int i = 0; i < input1.length(); i++) {
//			if (input1.charAt(i) != input1Arr[input1Arr.length - 1 - i]) {
//				desc = false;
//				break;
//			}
			input1Desc += input1Arr[input1Arr.length - 1 - i];
		}
// other Approach
//		if (asc)
//			ans = "Increasing:";
//		else if (desc)
//			ans = "Decreasing:";
//		else {
//			return "Invalid";
//		}
		if (input1.equals(input1Asc)) {
			ans = "Increasing:";
		}
		else if (input1.equals(input1Desc)) {
			ans = "Decreasing:";
		}
		else {
			return "Invalid";
		}
		for(int i = 0; i < input1.length(); i++) {
			if(input1.charAt(i) != input2.charAt(i)) {
				count++;
			}
		}

		return ans + count;
	}
}
