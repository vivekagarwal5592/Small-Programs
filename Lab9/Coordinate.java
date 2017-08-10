package Lab9;

public class Coordinate {

	private int row;
	private int column;
	private char coordinate ;
	
	public Coordinate(int row, int column, char coordinate) {
		//super();
		this.row = row;
		this.column = column;
		this.coordinate = coordinate;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public char getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(char coordinate) {
		this.coordinate = coordinate;
	}
	
	

	
}
