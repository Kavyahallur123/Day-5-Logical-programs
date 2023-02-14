public class PrimeNum {
    public static void main(String[] args) {
        int temp;

        for (int i=2;i<=30;i++){  //i=2  3 4 5
            temp=0;
            for (int j=2;j<i;j++){ //j=2 3 4 5 5
                if (i%j==0){        //0  2/3  3/4 4/5 5/5
                    temp++;   //1 1 1

                }
            }
            if (temp==0){
                System.out.println(i);
            }


        }


    }

}
