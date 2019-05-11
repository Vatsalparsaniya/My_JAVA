import java.util.Random;
public class PasswordDemo{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] n = new int[3];
        char[] ch = new char[3];
        ch[0] = (char)(rand.nextInt(26)+97);
        n[0] = rand.nextInt(10);
        ch[1] = (char)(rand.nextInt(26)+65);
        ch[2] = (char)(rand.nextInt(26)+97);
        n[1] = rand.nextInt(10);
        n[2] = rand.nextInt(10);

        System.out.print("Generated Password is: ");
        System.out.println(""+ch[0]+n[0]+ch[1]+ch[2]+n[1]+n[2]);
    }
}
