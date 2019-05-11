import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a= new int[9];
        int det = 0;
        for(int i=0;i<9;i++)
            a[i] = scan.nextInt();

        System.out.println("This is the given matrix by you: ");
        for(int i=0;i<9;i++){
            System.out.print(a[i] + " ");
            if(i%3==2)
            System.out.println();
        }

        for(int i=0;i<3;i++){
            int s = 0;
            
        }
        System.out.print("The determinant of your matrix is :");
    }
}
