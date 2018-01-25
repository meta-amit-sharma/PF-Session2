package Session2.pyramid2;

import static org.junit.Assert.*;

import org.junit.Test;



public class testPyramid2Junit {
	PrintPyramid2 pr=new PrintPyramid2();
	@Test
	public void test1() {
		int n=5;
		String expected="12345";
		String actual=pr.numbers(1, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		int n=5;
		String expected="1234";
		String actual=pr.numbers(2, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		int n=5;
		String expected="123";
		String actual=pr.numbers(3, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test4() {
		int n=5;
		String expected="12";
		String actual=pr.numbers(4, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test5() {
		int n=5;
		String expected="1";
		String actual=pr.numbers(5, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS1() {
		int n=5;
		String expected="";
		String actual=pr.spaces(1, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS2() {
		int n=5;
		String expected=" ";
		String actual=pr.spaces(2, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS3() {
		int n=5;
		String expected="  ";
		String actual=pr.spaces(3, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS4() {
		int n=5;
		String expected="   ";
		String actual=pr.spaces(4, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS5() {
		int n=5;
		String expected="    ";
		String actual=pr.spaces(5, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testPrint() {
		int n=5;
		String expected[]={"12345",
						   " 1234",
						   "  123",
						   "   12",
						   "    1"};
		String actual[]=pr.print(n);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void testPrint2() {
		int n=5;
		String expected[]={"1234",
						   " 123",
						   "  12",
						   "   1"};
		String actual[]=pr.print(n);
		assertArrayEquals(expected,actual);
	}

}
