package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);System.out.println("enetr the n value ");
		n= sc.nextInt();
		ArrayList a= new ArrayList();
		for(int i=0;i<n;i++)
		{
			int v =sc.nextInt();
			a.add(v);
		}
		System.out.println("before sorting"+a);
		Collections.sort(a);
		System.out.println("after sorting"+a);

	}

}
