package practice;
import java.util.*;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("a*", "aaaa"));
		System.out.println(Pattern.matches("[a-zA-E]+", "ABBcca"));
		System.out.println(Pattern.matches("^c?[a-z]+", "cabaab"));
		System.out.println(Pattern.matches("^[A-Z]+[a-z0-9]+{1,}[@][a-z]+(.com)$", "Example5@gmail.com"));
		System.out.println(Pattern.matches("^[A-Za-z]+[\\d\\W]{1,}$","Praveen1@"));
	}
}
