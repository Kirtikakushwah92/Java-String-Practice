package string;
//A password manager wants to create new passwords using two strings given by the user, then combined to create a harder-to- guess combination. 
//Given two strings, interleave the characters of the strings to create a new string. Beginning with an empty string, alternately append a character from string a and from string b. If one of the strings is exhausted before the other, append the remaining letters from the other string all at once. The result is the new password.
//
//Example :
//If a = ‘hackerrank’ and b = ‘mountain’,
//The result is hmaocuknetrariannk.

public class Program_21 {

	public static void main(String[] args) {
		String a = "hackerrank";
		String b = "mountain";
		String result = combineString(a,b);
		System.out.println(result);
	}
	public static String combineString(String a,String b) {
		String empty ="";
		int min = Math.min(a.length(), b.length());
		for(int i=0;i<min;i++) {
	
	        empty = empty + a.charAt(i);
	        empty = empty + b.charAt(i);
		}
		if(a.length()>min){
			empty = empty + a.substring(min);
		}
		if(b.length()>min) {
			empty = empty + b.substring(min);
		}
		return empty;
	}

}
