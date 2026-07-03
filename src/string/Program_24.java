package string;
//WAJP to take a String input and remove all the duplicate characters.
//i/p: abcaxbdacdptx
//o/p: abcxdpt

import java.util.Scanner;
public class Program_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String result =removeDuplicate(s);
		System.out.println(result);

	}
	public static String removeDuplicate(String s) {
		String  result ="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(result.indexOf(c)==-1) {
				result = result +c;
			}
		}
		return result;
	}
	

}
