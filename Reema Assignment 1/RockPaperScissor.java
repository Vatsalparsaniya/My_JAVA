import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor{
    public static void main(String[] args) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            int a = rand.nextInt(3);
            System.out.println("Let's play Rock Paper Scissor Game!");
            System.out.println("Enter 0:Rock, 1:Scissor, 2:Paper");
            int n = scan.nextInt();
            System.out.print("Time to choose by computer: ");
            if(a == 0) System.out.println("Rock");
            else if(a==1) System.out.println("Scissor");
            else System.out.println("Paper");

            if(n==a) System.out.println("It's draw");
            else if((n+1)%3==a) System.out.println("You win! Congrets.");
            else System.out.println("Computer win!");
    }
}
