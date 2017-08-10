package Homework1;

public class Theater {

	public static void main(String[] args) {

		String[] seats = new String[10];
		int index;
		boolean seat_occupied = false;
		for (int i = 0; i <= seats.length - 1; i++) {
			seats[i] = "-";
		}

		while (true) {
			boolean all_seats_occupied = false;
			int distance = -1;
			int point1 = -1;
			int point2 = -1;
			index = 0;
			seat_occupied = false;

			for (int i = 0; i <= seats.length - 1; i++) {
				if (seats[i].equals("-") && point1 == -1) {

					point1 = i;

				}

				else if (seats[i].equals("-") && point1 != -1) {
					point2 = i;
				}

				if (seats[i].equals("X") || i == seats.length - 1) {

					if (point2 - point1 - 1 > distance) {
						distance = (point2 - point1);
						index = (point1 + point2 + 1) / 2;
					}
					point1 = -1;
					point2 = -1;
				}

			}
			if (distance != -1) {
				for (int i = 0; i <= seats.length - 1; i++) {
					if (i == index) {
						seats[i] = "X";
						seat_occupied = true;

					}
				}
			}

			else {
				for (int i = 0; i <= seats.length - 1; i++) {

					if (seats[i].equals("-")) {
						seats[i] = "X";
						break;
					}
				}
			}

			for (int i = 0; i <= seats.length - 1; i++) {
				System.out.print(seats[i]);
			}

			System.out.println();

			for (int i = 0; i <= seats.length - 1; i++) {

				if (seats[i].equals("-")) {
					break;
				}

				else if (i == seats.length - 1) {
					all_seats_occupied = true;
				}
			}

			if (all_seats_occupied) {
				break;
			}

		}

	}

}
