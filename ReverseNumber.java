import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseCheck rr=new ReverseCheck();
        rr.revreseNum();

    }
}

class ReverseCheck{
    public void revreseNum(){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        n = s.nextInt();
        while (n > 0) {

            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;

        }
    }


}
