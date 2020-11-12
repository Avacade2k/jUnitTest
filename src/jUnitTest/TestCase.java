package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {
	
	TestFunc tf = new TestFunc();

	@Test
	void upp1() {
		assertEquals(2L, tf.lowestLong(2L, 4L));
	}
	
	@Test
	void upp2() {
		assertEquals(3f, tf.lowestFloat(3f, 5f));
	}
	
	@Test
	void upp3() {
		assertEquals(15, tf.lowestInt(35, 15));
	}
	
	@Test
	void upp4() {
		assertEquals(20.1, tf.lowestDouble(20.1, 20.6));
	}
	
	@Test
	void upp5n7() {
		assertEquals(20, tf.highestInt(20, 12));
	}
	
	@Test
	void upp6() {
		assertEquals(42.0, tf.highestDouble(42.0, 39.6));
	}
	
	@Test
	void upp8() {
		assertEquals(420L, tf.highestLong(420L, 12L));
	}

	@Test
	void upp9() {
		assertEquals(36, tf.powCheck(6.0, 2.0));
	}
	
	@Test
	void upp10() {
		assertEquals(11, tf.addInt(10));
	}
	
	@Test
	void upp11() {
		assertEquals(10421L, tf.addLong(10420L));
	}
	
	@Test
	void upp12() {
		assertEquals(99, tf.subInt(100));
	}
	
	@Test
	void upp13() {
		assertEquals(69L, tf.subLong(70L));
	}
	
	@Test
	void upp14() {
		assertEquals(5, tf.squareRootDouble(25.0), 0);
	}
	
	@Test
	void upp15() {
		assertEquals(4, tf.cubicRootDouble(64.0), 0);
	}
}
