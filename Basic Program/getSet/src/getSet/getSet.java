package getSet;

public class getSet {
	private int day, month, year; 
	
	
	public getSet(int day, int month, int year) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		}else {
			this.day = 1; // gan la ngay 1
		}
		if(month >= 1 && month <= 12) {
			this.month = month; 
		}else {
			this.month = 1;
		}
		if(year >= 0) {
			this.year = year;
		}else {
			this.year = 2024;
		}
		
	}


	public int getDay() {
		return this.day;
	}


	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		}
	}


	public int getMonth() {
		return this.month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year; 
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	
}
