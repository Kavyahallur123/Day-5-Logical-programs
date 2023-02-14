import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String arg[]) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number that you want to print the Harmonic Number");
        int harmonicNumber = scan.nextInt();
        for(int counter=1;counter<=harmonicNumber;counter++)
        {
            System.out.print("1/"+  +counter+" +");
        }
    }

    }

