package MonsterGame;

public class MonsterAttack  {

	private int id;
	private int date;
	private int month;
	private int year;
	private String Monster_name;
	private String Location;
	private int num_of_victims;
	
	public MonsterAttack(){		
	}
	
	public MonsterAttack(int id, int date,int month, int year,String Monster_name, String Location,int num_of_victims){
		this.id = id;
		this.date = date;
		this.month = month;
		this.year = year;
		this.Monster_name = Monster_name;
		this.Location = Location;
		this.num_of_victims = num_of_victims;	
	}
	
	

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public String getMonster_name() {
		return Monster_name;
	}

	public void setMonster_name(String monster_name) {
		Monster_name = monster_name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getNum_of_victims() {
		return num_of_victims;
	}

	public void setNum_of_victims(int num_of_victims) {
		this.num_of_victims = num_of_victims;
	}
	
	public String toString(){
		
		String data = "Attack # " + this.getId() + " occurred on " + this.getDate() + "/" + this.getMonth() + "/"
				+ this.getYear() + ", " + this.getMonster_name() + " attacked " + this.getLocation() + " resulting in "
				+ this.getNum_of_victims() + " tragic fatalities ";
		
		
		return data;
	}
	
	
}
