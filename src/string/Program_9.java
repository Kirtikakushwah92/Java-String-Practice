package string;
//WAJP to take a String input and segregate alphabets and numeric digits in any order.
//i/p: “a4cdx37d2b”
//o/p: “dcaxdb4372”
import java.util.Scanner;
public class Program_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		spaceCharacterIndex(s);
		

	}
	public static void spaceCharacterIndex(String s) {
		String result ="";
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				result = result + ch;
			}
			else {
				result = ch+result;
			}
			
			
		}
        System.out.println(result);
		
	}
	

}
