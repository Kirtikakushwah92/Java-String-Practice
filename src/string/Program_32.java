package string;
//WAJP to print the frequency of each character of the String.

import java.util.Scanner;
public class Program_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		printFrequencyOfEachCharacter(s);
		

	}
	public static void printFrequencyOfEachCharacter(String s) {
		int[] freq = new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println((char)(i) +" is "+ freq[i]+" times");
			}
		}
		
		
	}
	

}
