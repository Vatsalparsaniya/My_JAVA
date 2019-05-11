import java.util.Scanner;
public class HeilstoneSeries{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program computes Hailstone sequences.");
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        while(n!=1){
            if(n%2==0){
                System.out.println(n + " is even, so I take half = " + (n/2));
                n=n/2;
            }
            else{
                System.out.println(n + " is odd, so I make 3n+1 = " + (3*n+1));
                n = 3*n + 1;
            }
        }
    }
}
