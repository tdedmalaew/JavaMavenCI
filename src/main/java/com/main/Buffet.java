package com.main;

public class Buffet {
	public int number;
	public int total;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int calculateTotal() {
		if(this.number > 4) {
			this.total = (((this.number/5)*3)+(this.number%5))*630;
		}
		else {
			this.total = this.number*630;
		}
		return this.total;
	}
	
}
