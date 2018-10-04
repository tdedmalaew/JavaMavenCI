package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

import junit.framework.Assert;

public class BuffetTest {
	
	public int number;
	public Buffet buf;
	
	@Before
	public void before() {
		this.number = 0;
		this.buf = new Buffet();
	}

	@Test
	public void getNumberFromSetNumberByNumber() {
		this.number = 5;
		
		int expected = 5;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getNumberFromSetNumberByNumber3() {
		this.number = 3;
		
		int expected = 3;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}

}
