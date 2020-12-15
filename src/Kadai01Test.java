import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01Test {

	@Test
	void testReverseString() {
		Kadai01 k = new Kadai01();
		assertNull(k.ReverseString(null));
		assertEquals(4321,k.ReverseString("1234"));
		assertEquals("BA54",k.ReverseString("45AB"));
		assertEquals(8642,k.ReverseString("2468"));
		assertEquals(7531,k.ReverseString("1357"));
		assertEquals("GFEDCBA",k.ReverseString("ABCDEFG"));

	}


}