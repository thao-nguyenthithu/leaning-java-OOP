package phuongtiengt;

interface PTGTnew {
    public void diChuyen();
}

class XeDap implements PTGTnew{
    public void diChuyen(){
        System.out.println("Dap");
    }
}

class XeMay implements PTGTnew{
    public void diChuyen(){
        System.out.println("Gan may");
    }
}

class TauThuy implements PTGTnew{
    public void diChuyen(){
        System.out.println("Hoi nuoc");
    }
}

public class Main {
    public static void main(String[] args){
        XeDap xedap = new XeDap();
        xedap.diChuyen();
    }
}

