package reviews.reviews2;

public class Review13 {
    public static void main(String[] args) {
        double randmNum = Math.random()*4;
        int fortune = (int)randmNum;
        if(fortune==1) {
            System.out.println("大吉");
        }else if(fortune==2) {
            System.out.println("中吉");
        }else if(fortune==3) {
            System.out.println("小吉");
        }else{
            System.out.println("");
        }
    }
}
