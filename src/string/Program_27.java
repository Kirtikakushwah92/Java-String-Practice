package string;
//Write a java program to print the biggest numeric character from the given string.
//Return -1 if there is no numeric characters

import java.util.Scanner;
public class Program_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int result =findBiggestNumericCharacter(s);
		System.out.println("Biggest numeric character : "+result);

	}
	public static int findBiggestNumericCharacter(String s) {
		int biggest = 0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				if(ch>biggest) {
					biggest = ch;
				}
			}
		}
		if(biggest==0) {
			return -1;
		}
		return biggest-48;
	}
	

}
