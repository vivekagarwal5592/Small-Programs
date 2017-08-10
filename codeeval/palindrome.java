package codeeval;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int palindrome = 0;

		for (int i = 1; i <= 1000; i++) {
			boolean pal = true;
			String val = String.valueOf(i);
			for (int j = 0; j <= val.length() - 1; j++) {
				if (val.charAt(j) != val.charAt(val.length() - j - 1)) {
					pal = false;
					break;
				}

				if (pal == true) {

					for (int k = 2; k <= i - 1; k++) {
						if (i % k == 0) {
							
							pal = false;
							break;
						}
					}

					if (pal == true) {
						palindrome = i;
					}

				}
			}

		}

		System.out.println(String.valueOf(palindrome));

	}

}
