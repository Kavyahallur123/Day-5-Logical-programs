//6--1 .2,3

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any num");
        n=scanner.nextInt(); int flag=0; int sum=0;
        for (int i=1;i<n;i++){

            for (int j=1;j<=n;j++){
              if (n%i==0){
                  sum=sum+i;

                  System.out.println(i);
                  break;

              }
                if (n==sum){
                    System.out.println("Perfect num");
                }else {
                    System.out.println("not perfect num");
                }break;


            }

        }

    }
}

