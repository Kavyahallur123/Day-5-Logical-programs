import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        int temp=0;

        for (int i=1;i<=100;i++){

            for (int j=1;j<=100;j++){
               if (j*j==i){
                   System.out.println(i);
               }

            }

        }
    }
}
