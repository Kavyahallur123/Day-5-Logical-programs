import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Amstrong {

    public static void main(String[] args) {
        int n;
        int arm=0;
        int res=0;
        int rem;

        int c=0;

        Scanner s=new Scanner(System.in);
        System.out.println("Eter any number");
        n=s.nextInt();
        c=n;
        while (n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if (c==arm){
            System.out.println(arm+ " is amstrong ");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
