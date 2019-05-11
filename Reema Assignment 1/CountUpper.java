import java.util.Scanner;

public class CountUpper{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = scan.nextLine();
        System.out.println("There is "+ countUppercase(st) + " uppercase letters in your string");
    }

    static int countUppercase(String st){
        //char[] ch = st.toCharArray(); convert string to char array.
        int n = 0;
        for(int i = 0;i<st.length();i++)    //for string length we hava to call function.
            //if(Character.isUpperCase(ch[i])) Used for direct checking.
            if(st.charAt(i)>=65 && st.charAt(i)<=90)
                n++;
        return n;
    }
}
