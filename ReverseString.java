package Practice;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Hello";
		int l = s.length();
		String rev = "";
		for(int i = l - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
