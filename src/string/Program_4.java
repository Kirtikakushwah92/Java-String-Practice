package string;
//WAJP to take a String input and count all the characters without spaces in the String.


import java.util.Scanner;
public class Program_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int l = countCharacter(s);
		System.out.println(s+" : "+l);

	}
	public static int countCharacter(String s) {
		int count =0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
		
	}
	

}
