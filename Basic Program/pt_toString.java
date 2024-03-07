/*
 * 
 */
public class pt_toString {
    private int day, month, year; 
	
	public pt_toString(int day, int month, int year) {
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

    @Override
    public String toString() {
        return this.year + "";
    }

    public static void main(String[] args) {
        pt_toString st1 =  new pt_toString(2,7,2024);

        System.out.println(st1);
    }
}
