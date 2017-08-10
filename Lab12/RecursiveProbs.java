package Lab12;

public class RecursiveProbs {

	public boolean recursiveAllCharactersSame(String s) {

		if (s.length() <= 1) {
			return true;
		}

		else if (s.charAt(s.length() - 1) != s.charAt(s.length() - 2)) {
			return false;
		}

		else {
			return recursiveAllCharactersSame(s.substring(0, s.length() - 1));
		}

	}

	public String recursiveReverse(String s) {

		if (s.length() == 0 ) {
			String sa = "";
			return sa;
		}
		
		else if(s.length() == 1){
			
			return s;
		}

		else {
			return s.charAt(s.length() - 1) + recursiveReverse(s.substring(1, s.length() - 1)) + s.charAt(0);
		}

	}

	public int recursiveCount(char c, String s) {

		if (s.length() == 0) {
			return 0;
		}

		else {

			if (c == s.charAt(s.length() - 1)) {

				return 1 + recursiveCount(c, s.substring(0, s.length() - 1));
			}

			else {

				return 0 + recursiveCount(c, s.substring(0, s.length() - 1));
			}

		}

	}
	
	 public boolean recursiveContains(char c, String s){
			if(s.length() == 0) return false;
			if(s.charAt(s.length()-1)==c) return true;
			else return recursiveContains(c, s.substring(0, s.length() -1));		
		}

}
