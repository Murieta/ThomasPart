package edu.thomas.services;

public class FizzBuzzService {
	public static String small = "number too small";
	public static String big = "number too small";
	
	public static String getFizzBuzz(int number) {
		if(number<0) {
			return small;
		}
		if(number>100) {
			return big;
		}
		
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		if (number % 3 == 0) {
			return "Fizz";
		}
		if (number % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

}
