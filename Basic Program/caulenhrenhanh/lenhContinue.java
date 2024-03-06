package caulenhrenhanh;

// co label

public class lenhContinue {
    public static void main(String[] args) {
        loop1: for(int i = 2; i <= 9; i++){
            for(int j = 1; j <=10; j++){
                if(j >  5) 
                    continue loop1;
                System.out.println(i + " x " + j +" = " + (i *j));
            }
            System.out.println("-------------");
        }
    }
}
