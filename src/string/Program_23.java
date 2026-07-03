package string;
//WAJP to take a String input and count all numeric characters in the String.
import java.util.Scanner;
public class Program_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int l = sumNumericCharacter(s);
		System.out.println("sum : "+l);

	}
	public static int sumNumericCharacter(String s) {
		int sum =0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c>=48 && c<=57) {
				sum=sum+(c-48);
			}
		}
		return sum;
		
	}
	

}
