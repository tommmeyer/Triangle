package triangle.triangle;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTests {
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
	public void PerimeterTest() throws TriangleException{
		Triangle philJackson = new Triangle(3,4,5);
		
		assertEquals(philJackson.getPerimeter(),12,.1);

	}
	
	@Test
	public void AreaTest() throws TriangleException{
		Triangle philJackson = new Triangle(3,4,5);
		assertEquals(philJackson.getArea(), 6,.1);
	}
	
	@Test(expected = TriangleException.class)
	public void TriangleExceptionTest() throws TriangleException{
		Triangle philJackson = new Triangle(3,4,7);
		
	}
		
	}
