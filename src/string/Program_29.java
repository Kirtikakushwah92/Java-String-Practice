package string;
//WAJP to print all the character of the String exactly once(consider only alphabets in Uppercase)

import java.util.Scanner;
public class Program_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String res =onlyAlphabetUppercase(s);
		System.out.println(res);

	}
	public static String onlyAlphabetUppercase(String s) {
		s = s.toUpperCase();
		String result = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				if(result.indexOf(ch)==-1) {
					result = result +ch;
				}
			}
		}
		return result;
	}
	

}
