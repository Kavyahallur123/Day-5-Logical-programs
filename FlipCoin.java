import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {

        Random random=new Random();

        int checkRandom=2;
        int randomFlip=random.nextInt(checkRandom);

        if (randomFlip==1){
            System.out.println("Head");
        }else {
            System.out.println("Tail");
        }
    }
}
