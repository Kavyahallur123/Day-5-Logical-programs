import java.util.Scanner;

//enter num =n
//enter pow=p.......(3)....1-3..n=
public class PowerOfNum {
    public static void main(String[] args) {
        int res=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int n=s.nextInt();
        System.out.println("enter power of num");
        int p=s.nextInt();

        for (int i=1; i<=p;i++){
            res=n*res;

        }
        System.out.println("Power of number "+res);

    }
}
