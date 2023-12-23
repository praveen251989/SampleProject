package com.praveen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	
	Employee emp = new Employee();
	
	@Test
	public void testSum() {
		assertEquals(5, emp.sum(2, 3));
	}

}
