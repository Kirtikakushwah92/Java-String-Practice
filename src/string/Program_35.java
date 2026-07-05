package string;
//WAJP to print the character which is appeared only once in the String. Given that only one character has appeared once in the string.


import java.util.Scanner;
public class Program_35 {

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
			if(freq[s.charAt(i)]==1) {
				 System.out.println(s.charAt(i) + " is appeared only once");
				break;
			}
		}
		
		
	}
	

}
