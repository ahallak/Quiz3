package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

	static Triangle noArgTri;
	static Triangle Tri;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		noArgTri = new Triangle();
		Tri = new Triangle(7,10,5);
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
		assertTrue(noArgTri.getPerimeter() == 3);
		assertTrue(Tri.getPerimeter() == 22);
		assertTrue(noArgTri.getArea() == 0.43);
		assertTrue(Tri.getArea() == 16.25);
		}

}
