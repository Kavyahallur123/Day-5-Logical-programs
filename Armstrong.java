public class Armstrong {
    public static void main(String[] args) {
        Arms arms=new Arms();


        int n=153;int rem=0;int arm=0;int c;  //1-100
       // c=n;

        for (int a=100;a<=600;a++){
           c= arms.armstrongNum(a);
            if (c==a){
                System.out.println(a);
            }

        }
    }
}
class Arms {
    int temp = 0;

    public int armstrongNum(int n) {

        int arm=0; int rem=0;
        while (n>0){  // 153>0; 15>0 ;1>0

            rem= n%10; // 3; 5; 1;
            arm=(rem*rem*rem)+arm;// 27; 125+27;  125+27
            n=n/10;// 15; 1;

        }return arm;

    }

}





//153--->1^3+5^3+3^3
//c=n;
//while(n>0)
// rem=n%10
//arm= rem*rem*rem+arm
//n=n/10
//if(c==arm)