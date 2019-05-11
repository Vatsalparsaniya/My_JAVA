/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++){
		    int n = scan.nextInt();
            double fact = 1;
            for(int j=1; j<=n; j++)
                fact = fact*j;
		    System.out.printf("%.0f\n",fact);
		}
	}
}
