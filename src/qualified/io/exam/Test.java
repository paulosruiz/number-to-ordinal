package qualified.io.exam;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testZeroCase() {
		assertEquals(NumberToOrdinal.numberToOrdinal(0), "0");

	}

	@org.junit.jupiter.api.Test
	void testOneToTen() {
		assertEquals(NumberToOrdinal.numberToOrdinal(1), "1st");
		assertEquals(NumberToOrdinal.numberToOrdinal(2), "2nd");
		assertEquals(NumberToOrdinal.numberToOrdinal(3), "3rd");
		assertEquals(NumberToOrdinal.numberToOrdinal(10), "10th");

	}

	@org.junit.jupiter.api.Test
	void testTwentyToThirty() {
		assertEquals(NumberToOrdinal.numberToOrdinal(20), "20th");
		assertEquals(NumberToOrdinal.numberToOrdinal(21), "21st");
		assertEquals(NumberToOrdinal.numberToOrdinal(22), "22nd");
		assertEquals(NumberToOrdinal.numberToOrdinal(23), "23rd");
		assertEquals(NumberToOrdinal.numberToOrdinal(30), "30th");

	}

	@org.junit.jupiter.api.Test
	void testGreaterThenThirty() {
		assertEquals(NumberToOrdinal.numberToOrdinal(32), "32nd");
		assertEquals(NumberToOrdinal.numberToOrdinal(100), "100th");

		assertEquals(NumberToOrdinal.numberToOrdinal(100), "100th");
		assertEquals(NumberToOrdinal.numberToOrdinal(1000), "1000th");
		assertEquals(NumberToOrdinal.numberToOrdinal(9952), "9952nd");

	}

}
