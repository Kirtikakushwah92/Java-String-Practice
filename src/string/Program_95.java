package string;
//Valid username or not 
//Rules
//Username length should be between 5 and 15 characters.
//The first character must be a letter (A-Z or a-z).
//Remaining characters can contain:
//Letters (A-Z, a-z)
//Digits (0-9)
//Underscore (_)
//No spaces or other special characters are allowed.
import java.util.Scanner;
public class Program_95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean res = validUsername(s);
		System.out.println(res);
		

	}
	public static boolean validUsername(String username) {
//       check length 	
		if(username.length() < 5 || username.length()>15) {
			return false;
		}
		
//		First character must be letter
		
		char first = username.charAt(0);
		if(!((first <= 'A' && first>='Z') ||(first <= 'a' || first >='z') )) {
			return false;
		}
		
//		remaining character 
		
		for(int i=1;i<username.length();i++) {
			char c = username.charAt(i);
			if((c >= 'A' && c<= 'Z')||
					(c>='a' && c<='z')||
					(c>='0' && c<='9')||
					(c=='_')
					) {
				continue;
			}
			return false;
		}
		
		return true;
	}
	

}
