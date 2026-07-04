package string;
//WAJP to take a String input and count total number of words in the String( using split method)

import java.util.Scanner;
public class Program_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int result =countNumberOfWords(s);
		System.out.println("Total words : "+result);

	}
	public static int countNumberOfWords(String s) {
		if(s.trim().isEmpty()) {
			return 0;
		}
		String[] words = s.trim().split("\\s+");
		
	return words.length;
	}
	

}
