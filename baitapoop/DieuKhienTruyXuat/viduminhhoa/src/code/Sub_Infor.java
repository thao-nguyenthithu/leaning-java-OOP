package code;

public class Sub_Infor extends  Infor{
    public void method(){
//       super.testPrivate = 1 ; => ko truy cap duoc
        super.testNoModifier = 2; //=> truy cap duoc vi chung 1 goi
        super.testProtected = 3 ; //=> truy cap duoc
        super.testPublic = 4;
    }
}
