package Tornadoes;

public class Tornado {

	private String date;
	private String severity;
	private String location;
	
	public Tornado(String date, String severity, String location) {
		this.date = date;
		this.severity = severity;
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString(){
		
		String s = "Date: " + this.date + " Severity: " + severity + " Location: " + location + "\n";
		return s;
		
	}
	
	
	
}
