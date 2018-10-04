package com.main;

public class Calculate {
	
	public int score;
	public String grade;
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String calculateGrade() {
		if(this.score >=80) {
			this.grade = "A";
		}
		else if(this.score >= 75) {
			this.grade = "B+";
		}
		else if(this.score >= 70) {
			this.grade = "B";
		}
		else if(this.score >= 65) {
			this.grade = "C+";
		}
		else if(this.score >= 60) {
			this.grade = "C";
		}
		else if(this.score >= 55) {
			this.grade = "D+";
		}
		else if(this.score >= 50) {
			this.grade = "D";
		}
		else {
			this.grade = "F";
		}
		return this.grade;
	}

}
