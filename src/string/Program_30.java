package string;
//WAJP to print all the character of the String exactly once(consider only alphabets in Lowercase)

import java.util.Scanner;
public class Program_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String res =onlyAlphabetLowercase(s);
		System.out.println(res);

	}
	public static String onlyAlphabetLowercase(String s) {
		s = s.toLowerCase();
		String result = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(result.indexOf(ch)==-1) {
					result = result +ch;
				}
			}
		}
		return result;
	}
	

}
