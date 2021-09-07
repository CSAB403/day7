package q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List5 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String m = sc.next();
			al.add(m);
		}System.out.println(al);
		
	//	for(int j=0;j<n;j++)
		//{
		//	int s = sc.nextInt();
		//	al1.add(s);
		//}System.out.println(al1);
		Collections.swap(al, 1, 3);
		System.out.println(al);
	
}}