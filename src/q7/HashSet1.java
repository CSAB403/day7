package q7;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner (System.in);
		System.out.println("enetr th e no of matches");
		n=sc.nextInt();
		TreeSet t = new TreeSet();
		for(int i=0;i<n;i++)
		{
			String str = sc.next();
			t.add(str);
			
		}System.out.println(t);
		System.out.println(t.size());

	}

}
