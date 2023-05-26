import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 5555;
		assertEquals(expected, actual);

	}

	@Test
	public void testMultiply() {
		int a = 1111;
		int b = 5;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 5555;
		assertEquals(expected, actual);

	}

	@Test
	public void testDivide() {
		int a = 5555;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 1111;
		assertEquals(expected, actual);
	}

}
