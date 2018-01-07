package edu.thomas.services;

public class FizzBuzzService {
	public static String getFizzBuzz(int number) {
		if(number<0) {
			return "number too small";
		}
		if(number>100) {
			return "number too big";
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
