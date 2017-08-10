package MonsterGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AttackMonitor {

	ArrayList<MonsterAttack> monster_attck = new ArrayList<MonsterAttack>();
	Scanner input = new Scanner(System.in);
	String options[] = { "Add new Attack", " Get details of all the attacks", "Delete an attack", "Save Data",
			"Clear Data from List","Quit" };
	String file_path;

	public void monitor()  {

		boolean a = true;
		int x;

		while (a) {	
			int response = JOptionPane.showOptionDialog(null // Center in
																// window.
					, "What do you want to do?" // Message
					, "Monster Attack" // Title in titlebar
					, JOptionPane.YES_NO_OPTION // Option type
					, JOptionPane.PLAIN_MESSAGE // messageType
					, null // Icon (none)
					, options // Button text as above.
					, null);

			// System.out.println("What do you want to do?");
			// System.out.println("");
			// System.out.println("2.");
			// System.out.println("3. ");
			// System.out.println("4. ");

			// x = input.nextInt();

			switch (response) {
			case 0:
				note_attack_details();
				break;

			case 1:
				show_attack_details();
				break;

			case 2:
				delete_attack_details();
				break;

			case 3:
				save_data();
				break;

				
			case 4:
				 clear_old_data();
				break;
				
			case 5:
				a = false;
				break;
			}

		}
	}

	public void note_attack_details() {

		int id;
		String day;
		String Monster_name;
		String Location;
		int num_of_victims;
		int d;
		int month;
		int year;
		String date[] = new String[3];

		// System.out.println();
		while (true) {

			try {
				id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the attack ID"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter the correct attack ID");
			}
		}

		while (true) {

			day = JOptionPane.showInputDialog(null, "Enter the date in the format mm/dd/yyyy");

			try {
				date = day.split("/");
				d = Integer.parseInt(date[0]);
				month = Integer.parseInt(date[1]);
				year = Integer.parseInt(date[2]);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter the correct values for date");

			}
		}

		Monster_name = JOptionPane.showInputDialog(null, "Enter the Monster name");

		Location = JOptionPane.showInputDialog(null, "Enter the Location");

		while (true) {
			try {
				num_of_victims = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the fatalities"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter the correct value for fatalities");
			}

		}

		// monster_attck.add(new MonsterAttack());
		//
		// monster_attck.get(monster_attck.size()-1).setId(id);
		// monster_attck.get(monster_attck.size()-1).setDate(d);
		// monster_attck.get(monster_attck.size()-1).setMonth(month);
		// monster_attck.get(monster_attck.size()-1).setYear(year);
		// monster_attck.get(monster_attck.size()-1).setMonster_name(Monster_name);
		// monster_attck.get(monster_attck.size()-1).setLocation(Location);
		// monster_attck.get(monster_attck.size()-1).setNum_of_victims(num_of_victims);

		monster_attck.add(new MonsterAttack(id, d, month, year, Monster_name, Location, num_of_victims));

	}

	public boolean show_attack_details() {

		String output = "";

		for (int i = 0; i <= monster_attck.size() - 1; i++) {
			output += monster_attck.get(i) + "\n";

		}

		if (monster_attck.size() == 0) {
			JOptionPane.showMessageDialog(null, "No Attacks to show");
			return false;
		}

		else {
			JOptionPane.showMessageDialog(null, output); // Showing the attack list in message dilogue box
		}
		return true;
	}

	public void delete_attack_details() {

		boolean attacks_happended = this.show_attack_details();

		if (attacks_happended == false) {
			JOptionPane.showMessageDialog(null, "Since there are no attacks to show, you cannot delete any attack");

			return;
		}

		int id;
		while (true) {
			try {
				id = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Choose the attack you want to delete. Enter the Attack ID"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter the correct Attack ID");
			}

		}

		int count = 0;

		for (int i = 0; i <= monster_attck.size() - 1; i++) {

			if (monster_attck.get(i).getId() == id) {
				monster_attck.remove(i);
				JOptionPane.showMessageDialog(null, "Attack deleted");

				i -= 1;
				count += 1;
			}
		}
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "No Attack deleted");

		}

	}

	public void save_data() {

		
		
		file_path = JOptionPane.showInputDialog(null,"Enter the file path");
		
		
		
		try {
			
			File file = new File(file_path);
			
			FileWriter filewriter;
			
			filewriter = new FileWriter(file,true);
			
			
			for (int i = 0; i <= monster_attck.size() - 1; i++) {

				filewriter.write(String.valueOf(monster_attck.get(i).getId()) + ",");
				filewriter.write(String.valueOf(monster_attck.get(i).getDate() + "/" + monster_attck.get(i).getMonth()
						+ "/"+ monster_attck.get(i).getYear()) + ",");
				filewriter.write(String.valueOf(monster_attck.get(i).getMonster_name()) + ",");
				filewriter.write(String.valueOf(monster_attck.get(i).getLocation())  + "," );	
				filewriter.write(String.valueOf(monster_attck.get(i).getNum_of_victims()) );
				
				
				filewriter.write(System.getProperty( "line.separator"));
			
			}
			
			filewriter.close();
			JOptionPane.showMessageDialog(null,"Data has been saved");

		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null,"Please enter correct file path");
			
		}

	}
	
	public void clear_old_data() {
		
		try{
		monster_attck.removeAll(monster_attck);
		String data;
		String temp[];
		int id;
		String day[];
		String Monster_name;
		String Location;
		int num_of_victims;
		int d;
		int month;
		int year;
		String data_from_file ="";
		file_path = JOptionPane.showInputDialog(null,"Enter the file path");	
			File read_from = new File(file_path);
			Scanner filereader = new Scanner(read_from);
			
			if(filereader.hasNext()){
				filereader.nextLine();
			}
			
			while(filereader.hasNext()){
				data = filereader.nextLine();
				
				temp = data.split(",");
				
				id = Integer.parseInt(temp[0]);
				Monster_name = temp[2];
				Location = temp[3];
				num_of_victims = Integer.parseInt(temp[4]);
				day =temp[1].split("/");
				d  = Integer.parseInt(day[0]);
				month = Integer.parseInt(day[1]);
				year = Integer.parseInt(day[2]);
				
				monster_attck.add(new MonsterAttack(id,d,month,year,Monster_name,Location,num_of_victims));
				
			//	System.out.println(temp[0]);
				
				JOptionPane.showMessageDialog(null, "Data from List has been cleared and Attacks from the file"
						+ " have been uploaded in the List");
				
			}
			
			
			show_attack_details();
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Please enter correct file path");
		}		
		
	}

}
