package string;
//WAJP to take a String input and count all numeric characters in the String.
import java.util.Scanner;
public class Program_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int l = countNumeric(s);
		System.out.println(s+" : "+l);

	}
	public static int countNumeric(String s) {
		int count =0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		return count;
		
	}
	

}
