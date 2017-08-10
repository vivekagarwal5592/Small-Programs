package Lab9;

import javafx.scene.shape.Circle;

public class Bull {

	private int bull_position_row;
	private int bull_position_column;
	private Circle bull;
	
	public Bull(int bull_position_row, int bull_position_column, Circle bull) {
		this.bull_position_row = bull_position_row;
		this.bull_position_column = bull_position_column;
		this.bull = bull;
	}
	
	public int getBull_position_row() {
		return bull_position_row;
	}

	public void setBull_position_row(int bull_position_row) {
		this.bull_position_row = bull_position_row;
	}

	public int getBull_position_column() {
		return bull_position_column;
	}

	public void setBull_position_column(int bull_position_column) {
		this.bull_position_column = bull_position_column;
	}

	public Circle getBull() {
		return bull;
	}

	public void setBull(Circle bull) {
		this.bull = bull;
	}

	
	
	
	
}
