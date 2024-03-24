package test;

public enum Month {
	Jan(31), 
	Feb(29), 
	Mar(31), 
	Apr(30), 
	May(31), 
	Jun(30), 
	Jul(31), 
	Aug(31), 
	Sep(30), 
	Oct(31), 
	Nov(30), 
	Dec(31);
	
	private final int soNgay; 
	Month(int soNgay){
		this.soNgay = soNgay;
	}
	public int soNgay() {
		return soNgay;
	}
}
