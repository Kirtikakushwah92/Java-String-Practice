package string;
//Second largest Number in String:
//Input: s = "dfa12321afd"
//Output: 2
//Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

//Input: s = "abc1111"
//Output: -1
import java.util.Scanner;
public class Program_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int result =findBiggestNumericCharacter(s);
		System.out.println("Biggest numeric character : "+result);

	}
	public static int findBiggestNumericCharacter(String s) {
		int largest = -1; int secondLargest=-1;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				int digit = ch - '0';
				if(digit>largest) {
					secondLargest = largest;
					largest = digit;
				}
				else if(digit > secondLargest && digit != largest) {
					secondLargest = digit;
				}
			}
		}
		return secondLargest;
	}
	

}
