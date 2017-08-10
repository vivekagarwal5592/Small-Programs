package Lab9;

import java.util.Random;

public class StreetMap {

	Coordinate[][] cordinates;

	// public StreetMap(Coordinate[][] cordinates) {
	// super();
	// this.cordinates = cordinates;
	// }

	public StreetMap() {
		cordinates = new Coordinate[25][25];
		set_walls();
	}

	public void set_walls() {

		// for(int i = 0; i <= cordinates.length-1; i++){
		// for(int j = 0; j <= cordinates[i].length-1; j++){
		// cordinates[i][j] = new Coordinate(i, 0, ' ');
		// }
		// }

		for (int i = 0; i <= cordinates.length - 1; i++) {
			cordinates[i][0] = new Coordinate(i, 0, 'W');

		}

		for (int i = 0; i <= cordinates.length - 1; i++) {
			cordinates[i][cordinates[0].length - 1] = new Coordinate(i, cordinates.length - 1, 'W');

		}

		for (int i = 0; i <= cordinates.length - 1; i++) {
			cordinates[0][i] = new Coordinate(0, i, 'W');

		}

		for (int i = 0; i <= cordinates.length - 1; i++) {
			cordinates[cordinates.length - 1][i] = new Coordinate(0, i, 'W');

		}

		for (int i = 1; i <= cordinates.length - 2; i++) {
			for (int j = 1; j <= cordinates[i].length - 2; j++) {

				Random random = new Random();
				int counter = random.nextInt(10);

				if (counter == 1 || counter == 2 || counter == 3) {
					cordinates[i][j] = new Coordinate(i, j, 'W');
				}
				//
				else {
					cordinates[i][j] = new Coordinate(i, j, 'X');
				}
			}
		}

		cordinates[0][1].setCoordinate('S');
		cordinates[cordinates.length - 1][cordinates[0].length - 2].setCoordinate('E');

	}

}
