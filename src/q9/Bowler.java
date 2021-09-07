package q9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Bowler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList al =new ArrayList();
		for(int i=0;i<n;i++)
		{
			String str1= sc.next();
			al.add(str1);
		}
		System.out.println(al);
		TreeSet t =  new TreeSet(al);
	    System.out.println(t);

	}

}
