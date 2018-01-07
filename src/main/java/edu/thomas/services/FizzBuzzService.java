package edu.thomas.services;

public class FizzBuzzService {
	public static String small = "number too small";
	public static String big = "number too small";

	/*
	 * This methode des the FizzBuzz test for a given number. If the number is in
	 * the range of 0 to 100 it gives back 'FizzBuzz' for numbers that are divdable
	 * by 5 and 3. 'Fizz' for numbers that are divadble by 3 but not by 5 and 'Buzz'
	 * fpr numbers that are divadble by 5 and not by 3. All numbers that are not
	 * divadable by 3 or 5 are given back as string.
	 */
	public static String getFizzBuzz(int number) {
		if (number < 0) {
			return small;
		}
		if (number > 100) {
			return big;
		}

		if (isDividable(number, 3) && isDividable(number, 5)) {
			return "FizzBuzz";
		}
		if (isDividable(number, 3)) {
			return "Fizz";
		}
		if (isDividable(number, 5)) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

	/*
	 * this mehtod returns true if the given number is divadble by the second
	 * parameter
	 */
	private static boolean isDividable(int number, int dividor) {
		if (number % dividor == 0) {
			return true;
		} else {
			return false;
		}
	}

}
