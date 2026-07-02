package string;
//WAJP to take a String input and print all the indexes where numeric characters are present in the String.

import java.util.Scanner;
public class Program_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		numericCharacterIndex(s);
		

	}
	public static void numericCharacterIndex(String s) {
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)){
				System.out.println(i);
			}
			
		}
        
		
	}
	

}
