package exam;

public class Q3 {

	public static void main(String[] args) {
		String input1 = "zw:ci:mp:vr:do";
		System.out.println(formTheWord(input1));

	}

	public static String formTheWord(String input1) {
		String ans = "";
		for (int i = 0; i < input1.length() - 1; i += 3) {
			if (input1.charAt(i) == input1.charAt(i + 1)) {
				ans += input1.charAt(i);
			} else {
				ans += (char) (Math.abs(input1.charAt(i) - input1.charAt(i + 1)) + 'a' - 1);
			}
		}

		return ans.toUpperCase();
	}

}



//OUTPUT -- > CFCDK
