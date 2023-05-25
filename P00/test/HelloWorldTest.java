import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 65937
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Thursday 25-05-2023 09:42
 */


public class HelloWorldTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		
	}
	
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */


	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testAddThree() {
		int a = 4321;
		int b = 1234;
		int c=  5555;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b,c); 
			 
		int expected = 11110;
		assertEquals (expected, actual);
		}
	
	
	@Test
	public void testAddNegative() {
		int a = -4321;
		int b = -1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = -5555;
		assertEquals (expected, actual);
		}
	@Test
	public void testAddError() {
		int a = -4321;
		int b = -1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = -5550;
		assertNotEquals (expected, actual);
		}
	
	
	@Test
	public void testsubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testsubtractNegative() {
		int a = -4321;
		int b = -1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = -3087;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testsubtractError() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3086;
		assertNotEquals (expected, actual);
		}

	@Test
	public void testmultiple() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 5332114;
		assertEquals(actual,expected);
		

	}
	
	@Test
	public void testmultipleNegative() {
		int a = -4321;
		int b = -1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 5332114;
		assertEquals(actual,expected);
		

	}
	
	@Test
	public void testmultipleZero() {
		int a = 4321;
		int b = 0;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 0;
		assertEquals(actual,expected);
		

	}
	
	@Test
	public void testmultipleError() {
		int a = -4;
		int b = -2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 533;
		assertNotEquals(actual,expected);
		

	}
	@Test
	public void testdivide() {
		int a = 4000;
		int b = 1000;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected =4;
		assertEquals(actual,expected);
		

	}
	@Test
	public void testdivideNegative() {
		int a = -4000;
		int b = -1000;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected =4;
		assertEquals(actual,expected);
		

	}
	
	@Test
	public void testdivideError() {
		int a = -4000;
		int b = -1000;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected =5;
		assertNotEquals(actual,expected);
		

	}
	@Test
	public void testExpo() {
		int a = 2;
		int b = 3;
			
		Calculator cal = new Calculator();
		int actual = cal.exponential(a, b);
		int expected =8;
		assertEquals(actual,expected);
		

	}
	
	@Test
	public void testExpoNegative() {
		int a = -2;
		int b = -3;
			
		Calculator cal = new Calculator();
		double actual = cal.exponential(a, b);
		double expected =-0.125;
		assertNotEquals(actual,expected);
		

	}
	
	@Test
	public void testModulus() {
		int a = 10;
		int b = 3;
			
		Calculator cal = new Calculator();
		double actual = cal.exponential(a, b);
		double expected =1;
		assertNotEquals(actual,expected);
		

	}
	

	@Test
	public void testModulusNegative() {
		int a = -10;
		int b = 3;
			
		Calculator cal = new Calculator();
		double actual = cal.exponential(a, b);
		double expected =-1;
		assertNotEquals(actual,expected);
		

	}
	
	
	
	@Test
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void teardownAfterClss()throws Exception{}

}
