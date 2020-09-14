package qualified.io.exam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.Assert;

import qualified.io.exam.NumberToOrdinal;

class NumberToOrdinalTest {

	@Test
	void test() {
	
		assertEquals(NumberToOrdinal(0),"0");
		assertEquals(NumberToOrdinal(1),"1st");
		assertEquals(NumberToOrdinal(2) ,"2nd");
		assertEquals(NumberToOrdinal(3) ,"3rd");
		assertEquals(NumberToOrdinal(10),"10th");
		assertEquals(NumberToOrdinal(11),"11th");
		assertEquals(NumberToOrdinal(13),"13th");
		assertEquals(NumberToOrdinal(15),"15th");
		assertEquals(NumberToOrdinal(20),"20th");
		assertEquals(NumberToOrdinal(21),"21st");
		assertEquals(NumberToOrdinal(22),"22nd");
		assertEquals(NumberToOrdinal(23),"23rd");
		assertEquals(NumberToOrdinal(30),"30th");
		assertEquals(NumberToOrdinal(32),"32nd");
		
	}

}
