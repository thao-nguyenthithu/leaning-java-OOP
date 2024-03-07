public class MyData {
    private int day, month, year; 
	
	public MyData(int day, int month, int year) {
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

    @Override //equals: dung de so sanh 2 doi tuong a va b xem co bang nhau hay khong
        public boolean equals(Object obj) {

            // neu doi tuong truyen vao bang doi tuong đang đứng thì true
            if(obj == this)
                return  true;
            if(obj == null)
                return false;
            if(this.getClass() != obj.getClass())
                return false;

            //ep kieu du lieu 
            MyData o = (MyData) obj;
            if(this.day != o.day) return false; 
            if(this.month != o.month) return false;
            if(this.year != o.year) return false;

            return true;
        }

        
    //hashCode: hàm băm dùng để tạo khóa đại diện cho 1 đối tượng, ở đây chưa giải quyết đụng độ.
    @Override
    public int hashCode() {
        final int pr = 31; 
        int result = 1; 
        result = pr * result + day; 
        result = pr * result + month; 
        result = pr * result + year; 
        return result;
    }
    
    public static void main(String[] args) {
        MyData md1 =  new MyData(2,7,2024);
        MyData md2 = new MyData(2, 7, 2024);
        MyData md3 = new MyData(15, 7, 2025);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);
        
        // int a = 5; 
        // int b = 6; 

        // if(a == b){
        //     System.out.println("a = b");
        // }else{
        //     System.out.println("a != b");
        // }

        // if(md1 == md2){  // khong the so sang 2 doi tuong bang == 
        //     System.out.println("md1 == md2");
        // }else{
        //     System.out.println("md1 != md2");
        // }
        
        System.out.println("md1 bang md2: " + md1.equals(md2));
        System.out.println("md1 bang md3: " + md1.equals(md3));


        System.out.println("Hash code md1: " + md1.hashCode());
        System.out.println("Hash code md1: " + md2.hashCode());
        System.out.println("Hash code md1: " + md3.hashCode());
    }
}
