package q10;

import java.util.ArrayList;
import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr the no of BEST  bowlers in season 4");
		n = sc.nextInt();
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		for ( int i=0;i<n;i++)
		{
			String str2 = sc.next();
			al.add(str2);
			
		}		
		System.out.println("Player set 1:"+al);
		
		for ( int j=0;j<n;j++)
		{
			String str1 = sc.next();
			al1.add(str1);
			
		}	
		System.out.println("Player set 2:  "+al1);
		al.add(1,"Difference");
		System.out.println("Player set 1:  "+al);
	}

}
