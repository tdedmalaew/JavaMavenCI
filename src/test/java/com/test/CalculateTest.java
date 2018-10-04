package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

public class CalculateTest {
	
	public int score;
	public Calculate cal;
	
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	@Before
	public void initCalculate() {
		this.cal = new Calculate();
	}

	@Test
	public void getScoreFromSetScoreByScore100() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore100() {
		this.score = 100;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore80() {
		this.score = 80;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore90() {
		this.score = 90;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore75() {
		this.score = 75;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore79() {
		this.score = 79;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore70() {
		this.score = 70;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore74() {
		this.score = 74;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore65() {
		this.score = 65;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore69() {
		this.score = 65;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeAFromSetScoreAndCalculateByScore64() {
		this.score = 64;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeCFromSetScoreAndCalculateByScore60() {
		this.score = 60;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDPlusFromSetScoreAndCalculateByScore59() {
		this.score = 59;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDPlusFromSetScoreAndCalculateByScore55() {
		this.score = 55;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDPlusFromSetScoreAndCalculateByScore57() {
		this.score = 57;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDFromSetScoreAndCalculateByScore54() {
		this.score = 54;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDFromSetScoreAndCalculateByScore50() {
		this.score = 50;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeFFromSetScoreAndCalculateByScore52() {
		this.score = 52;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeFFromSetScoreAndCalculateByScore49() {
		this.score = 49;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeFFromSetScoreAndCalculateByScore0() {
		this.score = 0;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeAFromSetScoreAndCalculateByScore20() {
		this.score = 20;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}

}
