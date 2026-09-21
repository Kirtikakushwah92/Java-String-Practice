package string;
//28. Find the Index of the First Occurrence in a String

import java.util.Scanner;
import java.util.Stack;
public class Program_89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String haystack = "sadbutsad";
		String needle ="sad";
		int res = firstOccurrence(haystack,needle);
		System.out.println(res);
		

	}
	public static int firstOccurrence(String haystack,String needle) {
		
		if(needle.length()>haystack.length()) {
			return -1;
		}
		for(int i=0; i<=haystack.length()-needle.length();i++) {
			int j=0;
			while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)) {
				j++;
			}
			if(j==needle.length()) {
				return i;
			}
		}
		return -1;
		
	}
	

}
