package flyethiopian;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalcTest {
	calculatesalary x= new calculatesalary();
	@Test
	public void additionTest() {
		assertEquals(6,x.addition(3, 3));
	}

}
