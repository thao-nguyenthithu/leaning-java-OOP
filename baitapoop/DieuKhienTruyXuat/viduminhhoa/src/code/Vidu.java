package code;

public class Vidu {
    private  Infor infor;

    public void method(){
       // this.infor.testPrivate = 1 ; => ko truy xuat duoc
        this.infor.testNoModifier = 2; //=> truy xuat duoc
        this.infor.testProtected = 3; //=> van truy cap duoc
        this.infor.testPublic = 4;
    }
}
