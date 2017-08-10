package Lab12;

public class Recusrion {

	public static void main(String[] args) {
		
		
		String x = "abab";
		System.out.println(palindrome(x));
		System.out.println(all_characters_same(x));

	}
	
	public static boolean palindrome(String x){
		
		if(x.length()==0 || x.length() ==1){
			return true;
			
		}
		
		else if(x.charAt(0) == x.charAt(x.length()-1)){
			return palindrome(x.substring(1,x.length()-1));
		}
		
		else{
			return false;
			
		}	
		
	}
	
	public static boolean all_characters_same(String x){
		
		
		if(x.length() ==0 || x.length() ==1){
			return true;
		}
	else if(x.charAt(0) == x.charAt(x.length()-1)){
			return all_characters_same(x.substring(0,x.length()-1));
		}
		
		return false;
		
		
	}

}
