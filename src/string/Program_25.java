package string;
//WAJP to take a String input and count total number of words in the String(Without using split method)

import java.util.Scanner;
public class Program_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int result =countNumberOfWords(s);
		System.out.println("Total words : "+result);

	}
	public static int countNumberOfWords(String s) {
		boolean isWord= false;
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				if(!isWord) {
					count++;
					isWord=true;
				}
			}
			else {
				isWord=false;
			}
		}
		return count;
	}
	

}
