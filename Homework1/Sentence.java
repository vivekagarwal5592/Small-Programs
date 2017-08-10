package Homework1;

import java.util.Random;

public class Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String sentence(String noun[],String adjective[], String verb[], String preposition[],String article[]){

		Random r = new Random();

		String noun1 = "";
		String noun2 = "";
		String adjective1 = "";
		String adjective2 = "";
		String verb1 = "";
		String article1 ="";
		String article2 ="";
		String preposition1 ="";

		int x = r.nextInt(1);
		article1 = article[x];

	 x =r.nextInt(29);
		adjective1 = adjective[x];

		x =r.nextInt(29);
		noun1 = noun[x];

		x =r.nextInt(29);
		verb1 = verb[x];

		x =r.nextInt(20);
		preposition1 = preposition[x];

		x =r.nextInt(1);
		article2 = article[x];

		x =r.nextInt(29);
		adjective2 = adjective[x];

		x =r.nextInt(29);
		adjective1 = adjective[x];

		String s = article1 + adjective1 + noun1 + verb1 + preposition1 + article2 + adjective2 + adjective;

		return s;
		}
	
	
}
