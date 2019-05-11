import java.util.Scanner;

public class TargetDelete{

    static int[] deleteElement(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of your array: ");
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        System.out.println("Enter the target value: ");
        int target = scan.nextInt();

        int[] narr = deleteElement(arr,target);
        System.out.println("The new array is: ");
        for(int i=0;i<n;i++)
            System.out.print(narr[i] + " ");
    }
}
