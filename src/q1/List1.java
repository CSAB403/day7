package q1;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr the n value of csk ");
		n= sc.nextInt();
		ArrayList al= new ArrayList();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			al.add(a);
			sum = sum+a;
		}
		System.out.println(sum);
		float avg = sum/n;
		System.out.println(avg+0.6);
		
		//System.out.println(al.size());

	}

}
