package edu.thomas.services;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzServiceTest {

	public static final int INPUT_TOO_LARGE = 357;
	public static final int INPUT_TOO_SMALL = -1;

	@Test
	public void getFizzBuzzTest() throws Exception {
		String lowest = FizzBuzzService.getFizzBuzz(0);
		assertEquals("FizzBuzz", lowest);

		String fizz = FizzBuzzService.getFizzBuzz(6);
		assertEquals("Fizz", fizz);

		String buzz = FizzBuzzService.getFizzBuzz(10);
		assertEquals("Buzz", buzz);

		String fizzBuzz = FizzBuzzService.getFizzBuzz(30);
		assertEquals("FizzBuzz", fizzBuzz);

		String number = FizzBuzzService.getFizzBuzz(17);
		assertEquals("17", number);

	}

	public void invalideInput() throws Exception {
		String small = FizzBuzzService.getFizzBuzz(INPUT_TOO_SMALL);
		assertEquals("number too small", small);

		String big = FizzBuzzService.getFizzBuzz(INPUT_TOO_LARGE);
		assertEquals("number too big", big);
	}

}
