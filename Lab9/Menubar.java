package Lab9;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class Menubar extends MenuBar {

	Menu file = new Menu("File");
	Menu help = new Menu("Help");

	MenuItem new_game = new MenuItem("New...");
	MenuItem exit = new MenuItem("Exit");
	MenuItem about = new MenuItem("About");

	public Menubar() {

		file.getItems().add(new_game);
		file.getItems().add(exit);
		help.getItems().add(about);
		this.getMenus().add(file);
		this.getMenus().add(help);

	}

}
