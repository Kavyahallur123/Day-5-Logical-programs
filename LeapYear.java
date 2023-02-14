import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        LeapYearCheck l=new LeapYearCheck();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any year");
        int y=s.nextInt();
        l.lp(y);

    }
}
class LeapYearCheck{
    public void lp(int y){

        if (y%100==0 && y%400==0 || (y%100!=0 && y%4==0)){
            System.out.println("Leap year ");

        }else {
            System.out.println("Its not leap year");
        }

    }
}
