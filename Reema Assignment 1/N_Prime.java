import java.util.Scanner;
public class N_Prime{

    static boolean isprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number till which u want to get prime number");
        int n = scan.nextInt();

        System.out.println("The prime numbers are: ");
        for(int i = 2; i <= n; i++){
            if(isprime(i))  System.out.print(i + " ");
        }
    }
}
