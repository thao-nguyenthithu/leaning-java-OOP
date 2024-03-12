package test;

import code.Infor;

public class Sub_Infor2 extends Infor {
    public void method(){
//        super.testPrivate = 1; ko truy cap duoc
/*        super.testModifier = 2;  => ko truy cap duoc    */
        super.testProtected = 3;
        super.testPublic = 4;
    }
}
