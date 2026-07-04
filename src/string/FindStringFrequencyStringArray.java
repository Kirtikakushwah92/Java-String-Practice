package string;

public class FindStringFrequencyStringArray {

	public static void main(String[] args) {
		String[] s = {"i like mango","i like fruits","i like mango","i like apple","i like mango"};
		findStringFrequency(s);

	}
	public static void findStringFrequency(String[] s) {
		boolean [] visited = new boolean[s.length];
	
		for(int i=0;i<s.length;i++) {
			if(visited[i])
				continue;
			int count =1;
			for(int j = i+1 ;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(s[i]+": "+count);
		}
		
	}

}
