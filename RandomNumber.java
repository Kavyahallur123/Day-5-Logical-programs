import  java.util.Random;
import java.util.Scanner;
public class RandomNumber {


    public static void main(String[] args) {

        Random randomNumber=new Random();
        int n=randomNumber.nextInt(5);
        System.out.println(n);

    }

}
