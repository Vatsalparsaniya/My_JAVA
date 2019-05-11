import java.util.Scanner;

public class IsPrime{
    static int f=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(isprime(num))
            System.out.println(num + " is prime ");
        else{
            if(f==0) System.out.println(num + " is not prime");
            else   System.out.println("Negative number is not allowed");
        }
    }

    static boolean isprime(int n){
        if(n<0){
            f=1;
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)    return false;
        }
        return true;
    }
}
