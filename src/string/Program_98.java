package string;
//WAJP to Find All the Permutations of a String.
//Input: abc
//Output: 
//abc
//acb
//bac
//bca
//cab
//cba


import java.util.Scanner;
public class Program_98 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		permutation(s," ");
		

	}
	public static void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String left = s.substring(0,i);
			String right = s.substring(i+1);
			String remaining = left +right;
			permutation(remaining, ans+ch);
		}
		
		
	}
	

}
