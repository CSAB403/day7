package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class List4 {


			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				int n,m,count=0;
				n = sc.nextInt();
				m = sc.nextInt();
			//	ArrayList al0 = new ArrayList();
			//	al0.add("sateesh");
			//	al0.add("sateesh");
			//	al0.add("sateesh");
			//	System.out.println(al0);
				ArrayList al = new ArrayList();
				ArrayList al1 = new ArrayList();
				for(int i=0;i<n;i++)
				{
					String str = sc.next();
					al.add(str);
				}	System.out.println("the ipl top players names in ipl season8:  "+al);
					for(int j=0;j<m;j++)
					{
						String str1=sc.next();
						al1.add(str1);
					
					}	System.out.println("the ipl top player scorer names in ipl season9:  "+al1);
			        // 	al0.retainAll(al);
						al.retainAll(al1);
						
						
						
						System.out.println("consistent run scorer:  "+al);
				

		

		


	}

}
