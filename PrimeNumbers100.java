
//n%i==0;
//n==2
//n%n==0;

import java.util.Scanner;

public class PrimeNumbers100 {

    public static void main(String[] args) {
        int i,j,flag=0;int sum=0;
        for (i=2;i<=30;i++){
            for (j=2;j<=i-1;j++){  //checking whetr the no is divisible byy ant\y of the nubers b/n 1 to n
                if (i%j==0){
                    flag++; //1
                }
            }
            if (flag==0){
                System.out.println(i);
                sum=sum+i;

            }
            else {
                flag=0;
            }
        }


    }
}









