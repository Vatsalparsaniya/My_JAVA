import java.util.Scanner;

public class Factor{

    static boolean isFactor(int n,int i){
        if(n%i==0)  return true;
        else        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("The Factors of " + n + " is :");
        for(int i=1;i<= n;i++)
            if(isFactor(n,i)) System.out.print(i + " ");
    }
}
