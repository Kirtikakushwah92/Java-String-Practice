package string;
//WAJP to take a String input and count all the vowel characters in the String.


import java.util.Scanner;
public class Program_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		countVowels(s);
		

	}
	public static void countVowels(String s) {
		int vowelCount=0;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch== 'i' || ch=='o' ||ch=='u' || ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
				vowelCount++;
			}
		}
        System.out.println("Uppercase Letters : " + vowelCount);
        
		
	}
	

}
