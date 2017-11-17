package hu.webler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddTest {

	@Test
	void empty_input() {
		EvenOdd test = new EvenOdd(new Integer[] {});
		assertEquals(test.even, 0);
		assertEquals(test.odd, 0);
	}

	@Test
	void simple_input() {
		EvenOdd test = new EvenOdd(new Integer[] {0, 1});
		assertEquals(test.even, 1);
		assertEquals(test.odd, 1);
	}

	// irj tesztet bovebb, ertelmesebb bemenetre is

}
