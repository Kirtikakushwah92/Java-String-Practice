package string;
//Reverse Words in a String
public class Program_57 {

	public static void main(String[] args) {
		String s = "the sky is blue";
		String res = reverseWords(s);
		System.out.println(res);

	}
	public static String reverseWords(String s) {
		s = s.trim();
		String [] words = s.split("\\s+");
		String result ="";
		for(int i=words.length-1;i>=0;i--) {
			result = result + words[i];
			if(i!=0) {
				result = result+" ";
			}
		}
		return result;
	}

}
