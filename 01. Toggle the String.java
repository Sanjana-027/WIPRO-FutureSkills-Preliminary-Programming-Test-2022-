package exam;

public class toggleString {

	public static void main(String[] args) {
		String input1 = "Wipro";
		int input2 = 2;
		System.out.println(toggle(input1, input2));

	}

	public static String toggle(String input1, int input2) {

		if (input2 == 0) {
			// even
			String even = "";
			for (int i = 0; i < input1.length(); i += 2) {
				char c = input1.charAt(i);
				if (c >= 'a' && c <= 'z')
					even += (char) (c - 'a' + 'A');
				else even += (char) (c - 'A' + 'a');
			}
			return even;

		} else if (input2 == 1) {
			// odd
			String odd = "";
			for (int i = 1; i < input1.length(); i += 2) {
				char c = input1.charAt(i);
				if (c >= 'a' && c <= 'z')
					odd += (char) (c - 'a' + 'A');
				else odd += (char) (c - 'A' + 'a');
			}
			return odd;

		} else {
			// reverse
			String rev = "";
			for (int i = 0; i < input1.length(); i++) {
				char c = input1.charAt(i);
				if (c >= 'a' && c <= 'z')
					rev = (char) (c - 'a' + 'A') + rev;
				else rev = (char) (c - 'A' + 'a') + rev;
			}
			return rev;
		}
	}

}
