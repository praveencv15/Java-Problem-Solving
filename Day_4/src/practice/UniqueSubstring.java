package practice;
import java.util.*;
public class UniqueSubstring {
	public static void main(String[] args) {
		String s = "pwwkew";
		int l = 0;
		int r = 0;
		int max = 0;
		Set<Character> set = new HashSet<>();
		while(r < s.length()) {
			if(!set.contains(s.charAt(r))) {
				set.add(s.charAt(r++));
				max = Math.max(max, set.size());
			}
			else {
				set.remove(s.charAt(l++));
			}
		}
		System.out.println(max);
	}
}
