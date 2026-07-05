package string;
//WAJP to print the character which is appeared for the maximum times in the String.

import java.util.Scanner;
public class Program_36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		printMaxTimeChar(s);
		

	}
	public static void printMaxTimeChar(String s) {
		int[] freq = new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		int max=0;
		char ch = ' ';
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				if(freq[i]>max) {
				max = freq[i];
				ch = (char)(i);
				}
				
				
			}
		
		}
		System.out.println(ch +": "+max);
		
		
		
	}
	

}
