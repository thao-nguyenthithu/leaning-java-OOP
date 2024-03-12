package test;

import code.Infor;

public class Test {
    private Infor infor;

    public  void method(){
//        this.infor.testPrivate = 1 ; => ko truy cap duoc
//        this.infor.testModifier = 2 ; => ko truy cap duoc
//        this.infor.testProtected = 3 ; => ko truy cap duoc
        this.infor.testPublic = 4;
    }
}
