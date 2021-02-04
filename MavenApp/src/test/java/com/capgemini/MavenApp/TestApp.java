package com.capgemini.MavenApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestApp {
	
    App app;
	
	@Before
	public void setUp() throws Exception {
		app=new App();
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void checkWithNegativeValue() {
		app.fact(-4);
	}
	@Test
	public void checkWithPositiveValue() {
		assertEquals(24,app.fact(4));
	}
	@Test
	public void checkWithOne() {
		assertEquals(1,app.fact(1));
	}
	@Test
	public void checkWithZero() {
		assertEquals(1,app.fact(0));
	}
}
