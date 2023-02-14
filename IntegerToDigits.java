public class IntegerToDigits {
    public static void main(String[] args) {
        int a=545;

        while(a!=0){
            int digit=a%10;
            System.out.println(digit);
            a=a/10;
        }
    }
}
//546--5 ,4, 6
