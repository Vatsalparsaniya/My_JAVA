import java.util.Random;

public class RandomTry{
    public static void main(String[] args) {
            Random rand = new Random();
            int t = 0;
            while((rand.nextInt(51)+150)!=169)
                t++;
            System.out.println("The number of try is "+t);
    }
}
