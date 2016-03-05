package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TuitionCalculator_Test {

	static TuitionCalculator tuitTest;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tuitTest = new TuitionCalculator();
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
	public void testMethods() {
		assertTrue((TuitionCalculator.calculateTotalCost(10000, .05, 4)) == 45256.31);
		assertTrue((TuitionCalculator.calculateTotalCost(1,  .01,  4)) == 4.1);		
		assertTrue((TuitionCalculator.repaymentPerMonthCalculator(45256.31, 0.05, 4)) == 1042.22);
		assertTrue((TuitionCalculator.repaymentPerMonthCalculator(4.1, .01, 4)) == 0.09);
	}

}
