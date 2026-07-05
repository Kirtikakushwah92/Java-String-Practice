package string;
//Valid Password or NOT.

import java.util.Scanner;
public class Program_97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean res = validPassword(s);
		System.out.println(res);
		

	}
	public static boolean validPassword(String s) {
		if(s.length()<8) {
			return false;
		}
		boolean upper =false;
		boolean lower = false;
		boolean digit = false;
		boolean special = false;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				upper = true;
			}
			else if(ch>=97 && ch<=122) {
				lower = true;
			}
			else if(ch>=48 && ch<=57) {
				digit = true;
			}
			else {
				special = true;
			}
		}
		return upper && lower && digit && special;
		
	}
	

}
