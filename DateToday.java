import java.lang.*;
import java.util.Scanner;


public class DateToday{
	public static void main(String args[]){
		Scanner obj1 = new Scanner(System.in);
		int d,m,y;
		int cd=28,cm=1,cy=2019;
		int bd,bm,by;
		

		System.out.println("Enter the date of your birth:");
		bd = obj1.nextInt();
		System.out.println("Enter the month of your birth:");
		bm = obj1.nextInt();
		System.out.println("Enter the year of your birth:");
		by = obj1.nextInt();
		
		if(cd-bd >= 0)
			d = cd - bd;
		else{
			if
		}
			
		m = cm - bm;
		y = cy - by;

		System.out.println("My current age is: ");
		System.out.println(y + " years " + m + " month and " + d + " day");
	
	}			
}