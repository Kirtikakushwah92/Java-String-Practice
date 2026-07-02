package string;
//WAJP to take a String input and print all the indexes where space characters are present in the String.

import java.util.Scanner;
public class Program_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		spaceCharacterIndex(s);
		

	}
	public static void spaceCharacterIndex(String s) {
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' '){
				System.out.println("space index found in : "+i);
			}
			
		}
        
		
	}
	

}
