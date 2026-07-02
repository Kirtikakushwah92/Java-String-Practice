package string;
//WAJP to take a String input and count all the characters(excluding any special characters).

import java.util.Scanner;
public class Program_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int l = countCharacter(s);
		System.out.println(s+" : "+l);

	}
	public static int countCharacter(String s) {
		int count =0;
		for(int i=0;i<s.length();i++){
			if(Character.isAlphabetic(s.charAt(i))) {
				count++;
			}
		}
		return count;
		
	}
	

}
