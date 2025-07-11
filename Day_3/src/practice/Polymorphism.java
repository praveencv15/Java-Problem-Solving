package practice;
import java.util.*;

public class Polymorphism {
	public static void main(String[] args) {
		Vehicle v1 = new Cars();
		Vehicle v2 = new Bikes();
		
		v1.type("Sport", "BMW");
		v2.type("Cruiser", "Royal Enfield");
	}
}

class Vehicle{
	public void type(String type , String name) {
		System.out.println(name+" "+type);
	}
}

class Cars extends Vehicle{
	public void type(String type, String name) {
		System.out.println(name+" : "+type);
	}
}

class Bikes extends Vehicle{
	public void type(String type, String name) {
		System.out.println(name+" : "+type);
	}
}