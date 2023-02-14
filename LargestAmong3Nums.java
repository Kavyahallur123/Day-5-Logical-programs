import java.util.Scanner;

public class LargestAmong3Nums {
    public static void main(String[] args) {
        Largest l=new Largest();
        l.laregest();


    }
}

class Largest{
    public void laregest(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1=s.nextInt();
        System.out.println("enter 2nd number");
        int n2=s.nextInt();
        System.out.println("enter 3rd number");
        int n3=s.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("n1 is greater");
        } else if (n2>n1 && n2>n3) {
            System.out.println("n2 is greater");

        }else {
            System.out.println("n3 is greater");
            {

            }
        }


    }

}
