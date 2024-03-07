package getSet;

public class Main {
	public static void main(String[] args) {
		getSet gs = new getSet(30,7,2024);
		System.out.println("Day = " + gs.getDay());
		
		gs.setDay(35);
		System.out.println("Day = " + gs.getDay());
		
		gs.setDay(21);
		System.out.println("Day = " + gs.getDay());
	}
}
