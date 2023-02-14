public class SwapTwo {
    public static void main(String[] args) {

        int x=10;
        int y=20;
        int temp;

        if (x != y && y != x) {
//            temp=x;
//            x=y;
//            y=temp;
            x=x+y;
            y=x-y;
            x=x-y;


            System.out.println("x is "+x);
            System.out.println("y is "+y);

        }









    }


















}
