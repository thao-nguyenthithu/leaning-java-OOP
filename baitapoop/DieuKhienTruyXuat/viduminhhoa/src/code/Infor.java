package code;

public class Infor {
    private int testPrivate; // khi muon dung ngoai class thi phai dung getter - setter.
    int testNoModifier;
    protected int testProtected;
    public int testPublic;

    public void method(){
        this.testPrivate = 1;
        this.testNoModifier = 2;
        this.testProtected = 3;
        this.testPublic = 4;
    }
}
