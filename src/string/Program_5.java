package string;
//WAJP to take a String input and count all the space characters, uppercase, lowercase, numeric, special characters in the String.


import java.util.Scanner;
public class Program_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		countCharacter(s);
		

	}
	public static void countCharacter(String s) {
		int spaceCount =0;
		int upperCount=0;
		int lowerCount=0;
		int numericCount =0;
		int specialCount=0;

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isSpaceChar(ch)) {
				spaceCount++;
			}
			else if(Character.isUpperCase(ch)) {
				upperCount++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCount++;
			}
			else if(Character.isDigit(ch)) {
				numericCount++;
			}
			else {
				specialCount++;
			}
		}
        System.out.println("Uppercase Letters : " + upperCount);
        System.out.println("Lowercase Letters : " + lowerCount);
        System.out.println("Numeric Characters: " + numericCount);
        System.out.println("Space Characters  : " + spaceCount);
        System.out.println("Special Characters: " + specialCount);
		
	}
	

}
