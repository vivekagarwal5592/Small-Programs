package Homework1;

public class difference_numbers {

	public static void main(String[] args) {

		String val = "99991000010001";
		int x = 0;
		int first_number = 0;
		boolean flag = true;
		for (int i = 0; i <= val.length() - 2; i++) {

			x = Integer.parseInt(val.substring(0, i + 1));
		//	 System.out.println(x );
			int next = x + 1;
			// System.out.println(next);
			try {
				String y = val.substring(i + 1, String.valueOf(next).length() + i+1);
			//	 System.out.println(y);
				if (Integer.parseInt(y) - x == 1) {
					first_number = x;
					break;
				} else if (i == val.length() - 2) {
					flag = false;
				}
			} catch (Exception e) {
		//		System.out.println("NO");
				flag = false;
				break;
			}

		}

		// System.out.println(first_number );
		int j = String.valueOf(first_number).length();
		if (flag == true) {
//			for (int i = 0; i <= val.length() - 2; i++) {
			while(j < val.length()){
				int next = x + 1;
			//	i = String.valueOf(x).length();
				try {
				//	System.out.println(j);
					String y = val.substring(j, j + String.valueOf(next).length());

					if (Integer.parseInt(y) - x == 1) {
						j = j + y.length();
						x = Integer.parseInt(y);
					//	System.out.println("I am in 1 " + j);
						// i = String.valueOf(next).length();
					}
					else{
						flag = false;
						break;
					}

//					if (j == val.length()) {
//					//	flag = false;
//						break;
//					}

//					if (i == val.length() - 2) {
//						flag = false;
//					}
				} catch (Exception e) {
				//	System.out.println("NO");
					flag = false;
					break;
				}
			}
		}

		if (flag == true) {
			System.out.println("YES " + first_number);
		} else {
			System.out.println("NO");
		}

	}

}
