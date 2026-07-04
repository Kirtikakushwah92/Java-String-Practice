package string;

import java.util.HashMap;

public class FindStringFrequencyStringUsingHashmap {

	public static void main(String[] args) {
		String[] s = {"i like mango","i like fruits","i like mango","i like apple","i like mango"};
		findStringFrequency(s);

	}
	public static void findStringFrequency(String[] s) {
		HashMap<String,Integer> map = new HashMap<>();
		for(String word : s) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word,1);
			}
		}
		System.out.println(map);
	}

}
