// Uncommon Alphabets - UpperCase 
// Give two char arrays input1[] and input2[] which contains only UpperCase



package exam;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		char[] input1 = { 'A', 'B', 'B', 'C'};
		char[] input2 = { 'B', 'C' };

		System.out.println(findSum(input1, input2));
	}

	public static int findSum(char[] input1, char[] input2) {

		Arrays.sort(input1);
		Arrays.sort(input2);
		int ascii = 0;
		int i = 0, j = 0;
		while (i < input1.length && j < input2.length) {
			if (input1[i] == input2[j]) {
				i++;
				j++;
			}
			else if (input1[i] < input2[j]) {
				ascii += input1[i];
				i++;
			}
			else {
				ascii += input2[j];
				j++;
			}
		}
		while( i < input1.length) {
			ascii += input1[i++];
		}
		while( j < input2.length) {
			ascii += input2[j++];
		}
		

		
		int sum = 0;
		while (ascii > 0 || sum > 9) {
			if (ascii == 0) {
				ascii = sum;
				sum = 0;
			}
			int digit = ascii % 10;
			ascii = ascii / 10;
			sum += digit;
		}

		return sum;
	}
}
