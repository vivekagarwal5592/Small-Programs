package Competition;

public class Solution2 {
	int length_of_highest_number = 0;

	public static void main(String[] args) {

		Solution2 s = new Solution2();
		int a[] = { 4, 35, 80, 1323, 12, 44, 8, 5, 13 };

		s.solution(a, 3);

	}

	public void solution(int[] A, int K) {

		int temp = 0;
		for (int i = 0; i <= A.length - 1; i++) {
			// temp = A[i];
			if (A[i] > temp) {
				temp = A[i];
			}
		}

		// System.out.println(temp);
		length_of_highest_number = String.valueOf(temp).length();
		System.out.print("+");
		print_dashes(K);
		printline();
		for (int i = 1; i <= A.length; i++) {

			System.out.print("|");

			print_spaces(K, A[i - 1]);

			// System.out.printf("%.3f",String.valueOf(A[i - 1]));
			// System.out.print(A[i - 1]);
			if (i % K == 0) {
				System.out.print("|");
				System.out.println();
				System.out.print("+");

				print_dashes(K);
				printline();

			}
		}
		System.out.println();
		if (A.length % K != 0) {
			System.out.print("+");
			print_dashes(A.length % K);
			// System.out.print("|" );
		}
		//
		// print_dashes(k);

	}

	public void print_last_line_dashes(int k) {

	}

	public void print_dashes(int k) {

		// Integer.valueOf(String.valueOf(num).length()*5);
		for (int j = 1; j <= k; j++) {
			for (int l = 1; l <= length_of_highest_number; l++) {
				System.out.print("-");
			}

			System.out.print("+");
		}

	}

	public void printline() {
		System.out.println();
	}

	public void print_spaces(int k, int num) {

		// for (int j = 1; j <= k; j++) {

		// System.out.printf("%4d",num);

		int val = (length_of_highest_number - String.valueOf(num).length());

		// System.out.println(length_of_highest_number);
		switch (length_of_highest_number) {

		case 0:
			// System.out.print("I am in 0");
			System.out.printf("%0d", num);
			break;
		case 1:
			// System.out.print("I am in 1");
			System.out.printf("%1d", num);
			break;
		case 2:
			// System.out.print("I am in 2");
			System.out.printf("%2d", num);
			break;

		case 3:
			// System.out.print("I am in 3");
			System.out.printf("%3d", num);
			break;

		case 4:
			// System.out.print("I am in 4");
			System.out.printf("%4d", num);
			break;

		case 5:
			// System.out.print("I am in 5");
			System.out.printf("%5d", num);
			break;
		case 6:
			// System.out.print("I am in 6");
			System.out.printf("%6d", num);
			break;

		case 7:
			// System.out.print("I am in 7");
			System.out.printf("%7d", num);
			break;

		case 8:
			// System.out.print("I am in 8");
			System.out.printf("%8d", num);
			break;

		case 9:
			// System.out.print("I am in 9");
			System.out.printf("%9d", num);
			break;

		case 10:
			// System.out.print("I am in 10");
			System.out.printf("%10d", num);
			break;

		// }

		}

	}
}
