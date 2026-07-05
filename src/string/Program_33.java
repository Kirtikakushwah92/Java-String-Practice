package string;
//WAJP to print all the character which has appeared exactly once in the String.

import java.util.Scanner;
public class Program_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		printUniqueCharacter(s);
		

	}
	public static void printUniqueCharacter(String s) {
		int[] freq = new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1) {
				System.out.println((char)(i) +" is "+ freq[i]+" times");
			}
		}
		
		
	}
	

}
