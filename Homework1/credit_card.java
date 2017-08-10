package Homework1;

public class credit_card {

	public static void main(String[] args) {

		String credit_card = "1234";
		int even = 0;
		int odd = 0;
		int length = credit_card.length();
		int remainder;

		for (int i = 0; i <= length; i++) {

			if ((credit_card.length() - 1) % 2 == 0) {

				remainder = (Integer.parseInt(credit_card) % 10) * 2;

				if (remainder > 9) {

					even += remainder % 10 + remainder / 10;
					// System.out.println("even place:"+even);
				}

				else {
					even += remainder;
					// System.out.println("even place:"+even);
				}
			}

			else {
				odd += (Integer.parseInt(credit_card) % 10);
				// System.out.println("odd place:"+odd);
			}

			credit_card = String.valueOf(Integer.parseInt(credit_card) / 10);
		}

		int sum = even + odd;
		// System.out.println(sum);
		if (sum % 10 == 0) {
			System.out.println("Card is valid");
		}

		else {
			System.out.println("Card is not valid");
		}
	}

}
