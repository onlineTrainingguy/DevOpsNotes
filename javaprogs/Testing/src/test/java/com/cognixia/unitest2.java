package com.cognixia;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class unitest2 {
	
	

	@Test
	public void test() {
		int actual=1;
		int exepected=1;
		
		assertEquals(actual,exepected);
	}

	@Test
	public void test1() {
		int actual=1;
		int exepected=2;
		
		assertEquals(actual,exepected);
	}
}
