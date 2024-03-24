package test;

public class Test {
	public static void main(String[] args) {
		Timetable tt_t2 = new Timetable(Day.Monday, "Toan Ly Hoa"); 
		Timetable tt_t3 = new Timetable(Day.Tuesday, "Van Su Dia"); 
		Timetable tt_t4 = new Timetable(Day.Wednesday, "Ly Hoa Sinh"); 
		
		System.out.println(tt_t2);
		
		int x = Month.Jan.soNgay();
		System.out.println(x);
		
	}
	
}
