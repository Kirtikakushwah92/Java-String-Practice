package string;
//Valid Email or NOT.
//Rules
//There must be exactly one @.
//There must be at least one . after the @.
//The @ cannot be the first or last character.
//The . cannot be the first or last character.
//There should be at least one character between @ and ..

import java.util.Scanner;
public class Program_96 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean res = validEmail(s);
		System.out.println(res);
		

	}
	public static boolean validEmail(String email) {
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');

        // @ should be present only once
        if (at == -1 || at != email.lastIndexOf('@')) {
            return false;
        }

        // @ should not be first or last
        if (at == 0 || at == email.length() - 1) {
            return false;
        }

        // . should exist after @
        if (dot == -1 || dot < at + 2) {
            return false;
        }

        // . should not be the last character
        if (dot == email.length() - 1) {
            return false;
        }

        return true;	
		
	}
	

}
