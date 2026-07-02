package string;

//WAJP to take a String input and segregate alphabets and numeric digits while maintaining the order of characters.
//i/p: “a4cdx37d2b”
//o/p: “acdxdb4372”

import java.util.Scanner;
public class Program_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		moveDigitLastAndAlphaFirst(s);
		

	}
	public static void moveDigitLastAndAlphaFirst(String s) {
		String alpha =""; String digit="";
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				digit = digit+ch;
			}
			else {
				alpha = alpha +ch;
			}
			
			
		}
        System.out.println(alpha+digit);
		
	}
	

}
