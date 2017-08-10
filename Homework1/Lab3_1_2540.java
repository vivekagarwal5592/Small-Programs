package Homework1;

public class Lab3_1_2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "google";
		String first_part = "";
		String second_part = "";
		String third_part = "";
		
	
		// String first_part = "";

		for (int i = 0; i <= value.length() - 1;i++ ) {

			for (int j = i + 1; j <= value.length() - 1; j++) {
				if (value.charAt(i) == value.charAt(j)) {

					third_part = value.substring(j + 1);
					second_part = value.substring(i + 1, j);
					first_part = value.substring(0, i);
					value = first_part + second_part + third_part;

					
					

//					 System.out.println(first_part);
//					 System.out.println(second_part);
//					 System.out.println(third_part);
					// System.out.println(value);
					 i = -1;
				//	 j=i+1;
					// System.out.println(j);
					// break;
				}

			}
			

		}

		System.out.println(value);

	}

}
