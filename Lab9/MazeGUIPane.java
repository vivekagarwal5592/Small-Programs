package Lab9;

import java.util.Random;

import com.sun.javafx.scene.control.skin.LabeledText;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class MazeGUIPane extends BorderPane {

	Button start;
	Menubar menubar = new Menubar();
	StreetMap streetmap = new StreetMap();
	Label labels[][] = new Label[streetmap.cordinates.length][streetmap.cordinates[0].length];
	Circle man;

	Text t = new Text();
	private int man_position_row;
	private int man_position_column;

	private int man_no_of_moves;
	private int distance_row;
	private int distance_column;
	Bull b;
	GridPane gp = new GridPane();

	public MazeGUIPane() {

		man = new Circle();
		man_no_of_moves = 0;
		Button start = new Button("Start");
		setWalls();
		addman();

		this.setTop(menubar);
		this.setCenter(gp);
		Menubar_events();
		b = new Bull(streetmap.cordinates[0][1].getRow(), streetmap.cordinates[0][1].getColumn(), new Circle());
		addbull();
	}

	public void setWalls() {

		for (int i = 0; i <= labels.length - 1; i++) {
			for (int j = 0; j <= labels[i].length - 1; j++) {

				streetmap.cordinates[i][j].setRow(i);
				streetmap.cordinates[i][j].setColumn(j);
				if (streetmap.cordinates[i][j].getCoordinate() == 'W') {

					labels[i][j] = new Label();
					labels[i][j].setText("       ");
					labels[i][j].setId(String.valueOf(i) + "," + String.valueOf(j));
					labels[i][j].setStyle("-fx-background-color: #000000;");
					labels[i][j].setTextFill(Color.web("#000000"));

					gp.add(labels[i][j], j, i);
					gp.setMargin(labels[i][j], new Insets(0.5, 0.5, 0.5, 0.5));
					// labels[i][j].setAccessibleText("ttttt");
				}

				else if (streetmap.cordinates[i][j].getCoordinate() == 'X') {

					labels[i][j] = new Label();
					labels[i][j].setText("       ");
					labels[i][j].setId(String.valueOf(i) + "," + String.valueOf(j));
					labels[i][j].setStyle("-fx-background-color: #ffffff;");
					labels[i][j].setTextFill(Color.web("#ffffff"));

					gp.add(labels[i][j], j, i);
					gp.setMargin(labels[i][j], new Insets(0.5, 0.5, 0.5, 0.5));

				}

				else if (streetmap.cordinates[i][j].getCoordinate() == 'S') {
					labels[i][j] = new Label();
					labels[i][j].setText(" S ");
					labels[i][j].setStyle("-fx-background-color: #0000ff;");

					gp.add(labels[i][j], j, i);
					gp.setMargin(labels[i][j], new Insets(0.5, 0.5, 0.5, 0.5));
				}

				else if (streetmap.cordinates[i][j].getCoordinate() == 'E') {
					labels[i][j] = new Label();
					labels[i][j].setText(" E ");
					labels[i][j].setStyle("-fx-background-color: #0000ff;");

					gp.add(labels[i][j], j, i);
					gp.setMargin(labels[i][j], new Insets(0.5, 0.5, 0.5, 0.5));
				}

				EventHandler<Event> handler = new EventHandler<Event>() {
					@Override
					public void handle(Event e) {

						Label l = (Label) e.getSource();
						String[] arr;
						arr = l.getId().split(",");
						int x = Integer.parseInt(arr[0]);
						int y = Integer.parseInt(arr[1]);

						if (streetmap.cordinates[x][y].getCoordinate() == 'X') {
							if (check_for_border_wall(x, y)) {
								streetmap.cordinates[x][y].setCoordinate('W');
								labels[x][y].setStyle("-fx-background-color: #000000;");
								// labels[x][y].setTextFill(Color.web("#000000"));
							}
						}

						else if (streetmap.cordinates[x][y].getCoordinate() == 'W') {
							if (check_for_border_wall(x, y)) {
								streetmap.cordinates[x][y].setCoordinate('X');
								labels[x][y].setStyle("-fx-background-color: #ffffff;");
								// labels[x][y].setTextFill(Color.web("#ffffff"));
							}
						}
						bull_break_wall();

					}
				};
				labels[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
			}
		}

	}

	public void addman() {
		man.setRadius(4);
		this.gp.add(man, streetmap.cordinates[0][1].getColumn(), streetmap.cordinates[0][1].getRow());
	}

	public void addbull() {

		this.gp.add(b.getBull(), streetmap.cordinates[0][1].getColumn(), streetmap.cordinates[0][1].getRow());
		b.getBull().setRadius(5);
		b.getBull().setFill(Color.RED);

		b.setBull_position_row(streetmap.cordinates[0][1].getRow());
		b.setBull_position_column(streetmap.cordinates[0][1].getColumn());

	}

	public void move_man_x(int direction) {
		int row;
		int column;
		column = this.gp.getRowIndex(man);
		row = this.gp.getColumnIndex(man);

		// .gp.getChildren().remove(man);
		if (direction == 1) {
			if (streetmap.cordinates[column][row + 1].getCoordinate() != 'W') {
				this.gp.getChildren().remove(man);
				this.gp.add(man, streetmap.cordinates[column][row + 1].getColumn(),
						streetmap.cordinates[column][row + 1].getRow());

				man_position_row = streetmap.cordinates[column][row + 1].getRow();
				man_position_column = streetmap.cordinates[column][row + 1].getColumn();
				man_no_of_moves += 1;
				movebull();
			}
		}

		if (direction == -1) {
			if (streetmap.cordinates[column][row - 1].getCoordinate() != 'W') {
				this.gp.getChildren().remove(man);
				this.gp.add(man, streetmap.cordinates[column][row - 1].getColumn(),
						streetmap.cordinates[column][row - 1].getRow());

				man_position_row = streetmap.cordinates[column][row - 1].getRow();
				man_position_column = streetmap.cordinates[column][row - 1].getColumn();
				man_no_of_moves += 1;

				movebull();
			}
		}
	}

	public void move_man_y(int direction) {
		// man.setCenterY(man.getCenterY() + 1);
		int row;
		int column;
		column = this.gp.getRowIndex(man);
		row = this.gp.getColumnIndex(man);

		// .gp.getChildren().remove(man);
		if (direction == 1) {
			if (streetmap.cordinates[column + 1][row].getCoordinate() != 'W') {

				this.gp.getChildren().remove(man);
				this.gp.add(man, streetmap.cordinates[column + 1][row].getColumn(),
						streetmap.cordinates[column + 1][row].getRow());

				man_position_row = streetmap.cordinates[column + 1][row].getRow();
				man_position_column = streetmap.cordinates[column + 1][row].getColumn();
				man_no_of_moves += 1;
				if (check_for_win()) {
					show_win_message();
				}
				movebull();
			}

		}
		if (direction == -1) {
			// if (streetmap.cordinates[column - 1][row].getRow() >= 0) {

			if (streetmap.cordinates[column - 1][row].getCoordinate() != 'W') {
				this.gp.getChildren().remove(man);
				this.gp.add(man, streetmap.cordinates[column - 1][row].getColumn(),
						streetmap.cordinates[column - 1][row].getRow());

				man_position_row = streetmap.cordinates[column - 1][row].getRow();
				man_position_column = streetmap.cordinates[column - 1][row].getColumn();
				man_no_of_moves += 1;
				if (check_for_win()) {
					show_win_message();
				}
				movebull();
			}
		}
		// }

	}

	public void movebull() {

		if (man_no_of_moves > 4) {
			distance_row = man_position_row - b.getBull_position_row();
			distance_column = man_position_column - b.getBull_position_column();

			if (distance_row != 0 && distance_column != 0) {

				Random r = new Random();
				boolean flag = r.nextBoolean(); // This flag is random so that
												// bull can move randomly in the
												// x or y direction

				if (flag) {
					priority(0);
				}

				else {
					priority2(0);
				}

			}

			else if (distance_row == 0) {
				if (distance_column > 0) {
					move_right(0);
				}
				if (distance_column < 0) {
					move_left(0);
				}
			}

			else if (distance_column == 0) {
				if (distance_row > 0) {
					move_down(0);

				}
				if (distance_row < 0) {
					move_up(0);
				}

			}

			this.gp.getChildren().remove(b.getBull());
			this.gp.add(b.getBull(),
					streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column()].getColumn(),
					streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column()].getRow());
			if (check_for_lose()) {
				show_lose_message();
			}
		}
	}

	// moving in column means moving up or down

	public int move_up(int x) {
		// System.out.println("up");
		if (b.getBull_position_row() >= 1) {
			if (streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column()]
					.getCoordinate() != 'W') {
				if (streetmap.cordinates[b.getBull_position_row() - 2][b.getBull_position_column()]
						.getCoordinate() != 'W') {
					b.setBull_position_row(b.getBull_position_row() - 2);
					return -1;
				} else {
					b.setBull_position_row(b.getBull_position_row() - 1);
					return -1;
				}
			} else {
				return x + 1;
			}
		}
		return -1;
	}

	public int move_down(int x) {
		if (streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column()].getCoordinate() != 'W') {
			if (streetmap.cordinates[b.getBull_position_row() + 2][b.getBull_position_column()]
					.getCoordinate() != 'W') {
				b.setBull_position_row(b.getBull_position_row() + 2);
				return -1;
			} else {
				b.setBull_position_row(b.getBull_position_row() + 1);

				return -1;
			}
		} else {
			return x + 1;
		}

	}

	// moving in row means moving left or right

	public int move_left(int x) {
		if (b.getBull_position_column() >= 1) {
			if (streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() - 1]
					.getCoordinate() != 'W') {
				if (streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() - 2]
						.getCoordinate() != 'W') {
					b.setBull_position_column(b.getBull_position_column() - 2);
					return -1;
				} else {
					b.setBull_position_column(b.getBull_position_column() - 1);

					return -1;
				}

			}

			else {
				return x + 1;
			}
		}
		return -1;
	}

	public int move_right(int x) {
		// System.out.println("right");
		if (streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() + 1].getCoordinate() != 'W') {
			if (streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() + 2]
					.getCoordinate() != 'W') {
				b.setBull_position_column(b.getBull_position_column() + 2);
				return -1;
			} else {
				b.setBull_position_column(b.getBull_position_column() + 1);
				return -1;
			}

		}

		else {
			return x + 1;
		}

	}

	public void priority(int x) {

		if (x == 0) {

			// System.out.println("x :" + String.valueOf(x));
			if (distance_column > 0) {
				x = move_right(0);
			}

			if (distance_column < 0) {
				x = move_left(0);
			}

		}
		if (x == 1) {

			if (distance_row > 0) {
				x = move_down(1);

			}
			if (distance_row < 0) {
				x = move_up(1);

			}

		}
		if (x == 2) {

			if (distance_column < 0) {
				x = move_right(2);
			}

			if (distance_column > 0) {
				x = move_left(2);
			}

		}
		if (x == 3) {

			if (distance_row < 0) {
				x = move_down(3);

			}
			if (distance_row > 0) {
				x = move_up(3);

			}
		}
	}

	public void priority2(int x) {
		if (x == 0) {

			if (distance_row > 0) {
				x = move_down(0);

			}
			if (distance_row < 0) {
				x = move_up(0);

			}

		}
		if (x == 1) {
			// System.out.println("x :" + String.valueOf(x));
			if (distance_column > 0) {
				x = move_right(1);
			}

			if (distance_column < 0) {
				x = move_left(1);
			}

		}
		if (x == 2) {
			// System.out.println("x :" + String.valueOf(x));
			if (distance_row < 0) {
				x = move_down(2);

			}
			if (distance_row > 0) {
				x = move_up(2);

			}

		}
		if (x == 3) {
			// System.out.println("x :" + String.valueOf(x));
			if (distance_column < 0) {
				x = move_right(3);
			}

			if (distance_column > 0) {
				x = move_left(3);
			}

		}
	}

	public boolean check_for_lose() {

		if (b.getBull_position_row() == man_position_row && b.getBull_position_column() == man_position_column) {
			return true;
		}

		else {
			return false;
		}

	}

	public void show_lose_message() {

		ButtonType new_game = new ButtonType("New Game", ButtonData.OK_DONE);
		ButtonType exit = new ButtonType("Exit", ButtonData.OK_DONE);
		Alert alert = new Alert(AlertType.CONFIRMATION, "You Lose", new_game, exit);
		alert.setHeaderText(null);
		alert.setTitle("Bull Run");

		alert.showAndWait();

		if (alert.getResult() == exit) {
			System.exit(0);
		}

		if (alert.getResult() == new_game) {
			new_game();
		}

	}

	public void show_win_message() {

		ButtonType new_game = new ButtonType("New Game", ButtonData.OK_DONE);
		ButtonType exit = new ButtonType("Exit", ButtonData.OK_DONE);
		Alert alert = new Alert(AlertType.CONFIRMATION, "You Win", new_game, exit);
		alert.setHeaderText(null);
		alert.setTitle("Bull Run");

		alert.showAndWait();

		if (alert.getResult() == exit) {
			System.exit(0);
		}

		if (alert.getResult() == new_game) {
			new_game();
		}

	}

	public void Menubar_events() {

		menubar.new_game.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				new_game();
			}

		});

		menubar.exit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}

		});

		menubar.about.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Instructions");
				alert.setHeaderText(null);
				alert.setContentText(
						"Save your man from the bull. Find your way through the "
						+ "streets of Pamplona before the bull finds you. Keep in mind the bull is faster than you."
						+ " You take one step, the bull takes two. You break a wall to find your way, the bull breaks another wall "
						+ "to find you ");
				alert.showAndWait();

			}

		});

	}

	public void new_game() {
		streetmap.set_walls();
		this.setWalls();
		gp.getChildren().remove(b.getBull());
		gp.getChildren().remove(man);
		addman();
		addbull();
		man_no_of_moves = 0;
	}

	public void bull_break_wall() {

		Random r = new Random();
		boolean wall_broken = false;
		int count = 0;
		if (man_no_of_moves > 4) {

			while (!wall_broken && count <= 50) {
				int wall = r.nextInt(9);
				switch (wall) {

				case 1:
					if (streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() - 1]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row(), b.getBull_position_column() - 1)) {

							streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() - 1]
									.setCoordinate('X');
							labels[b.getBull_position_row()][b.getBull_position_column() - 1]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 2:
					if (streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column() - 1]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row() - 1, b.getBull_position_column() - 1)) {
							streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column() - 1]
									.setCoordinate('X');
							labels[b.getBull_position_row() - 1][b.getBull_position_column() - 1]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 3:
					if (streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column()]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row() - 1, b.getBull_position_column())) {
							streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column()]
									.setCoordinate('X');
							labels[b.getBull_position_row() - 1][b.getBull_position_column()]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 4:
					if (streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column() + 1]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row() - 1, b.getBull_position_column() + 1)) {
							streetmap.cordinates[b.getBull_position_row() - 1][b.getBull_position_column() + 1]
									.setCoordinate('X');
							labels[b.getBull_position_row() - 1][b.getBull_position_column() + 1]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 5:
					if (streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() + 1]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row(), b.getBull_position_column() + 1)) {
							streetmap.cordinates[b.getBull_position_row()][b.getBull_position_column() + 1]
									.setCoordinate('X');
							labels[b.getBull_position_row()][b.getBull_position_column() + 1]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 6:
					if (streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column() + 1]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row() + 1, b.getBull_position_column() + 1)) {
							streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column() + 1]
									.setCoordinate('X');
							labels[b.getBull_position_row() + 1][b.getBull_position_column() + 1]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 7:
					if (streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column()]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row() + 1, b.getBull_position_column())) {
							streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column()]
									.setCoordinate('X');
							labels[b.getBull_position_row() + 1][b.getBull_position_column()]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;
				case 8:
					if (streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column() - 1]
							.getCoordinate() == 'W') {
						if (check_for_border_wall(b.getBull_position_row() + 1, b.getBull_position_column() - 1)) {
							streetmap.cordinates[b.getBull_position_row() + 1][b.getBull_position_column() - 1]
									.setCoordinate('X');
							labels[b.getBull_position_row() + 1][b.getBull_position_column() - 1]
									.setStyle("-fx-background-color: #ffffff;");
							wall_broken = true;
						}
					}
					count++;
					break;

				}
			}
		}
	}

	public boolean check_for_border_wall(int row, int column) {

		if (row == 0 || row == streetmap.cordinates.length - 1) {
			return false;
		}

		else if (column == 0 || column == streetmap.cordinates[0].length - 1) {
			return false;
		}

		else if (row == man_position_row && column == man_position_column) {
			return false;
		}

		else if (row == b.getBull_position_row() && column == b.getBull_position_column()) {
			return false;
		}

		return true;

	}

	public boolean check_for_win() {

		if (man_position_row == streetmap.cordinates.length - 1
				&& man_position_column == streetmap.cordinates[0].length - 2) {
			return true;
		}

		return false;
	}
}
