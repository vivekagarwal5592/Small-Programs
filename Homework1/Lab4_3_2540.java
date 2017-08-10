package Homework1;

public class Lab4_3_2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 15, 1, 20, 55, 5, 100 };
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
