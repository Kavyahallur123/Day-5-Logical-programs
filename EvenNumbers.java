public class EvenNumbers {
    public static void main(String[] args) {
        EvenAndOdd eo=new EvenAndOdd();

        for (int n=1;n<=10;n++){
            int num=eo.EvenOdd(n);
            System.out.println(num);
        }

    }
}
class EvenAndOdd{
    int flag=0;
    public int EvenOdd(int n){

        if (n%2!=0){
            flag++;

        }return n;
    }
}
