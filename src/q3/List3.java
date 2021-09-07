package q3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" entere the m value");
		 m = sc.nextInt();
		LinkedList al =new LinkedList();
		for(int i=0;i<m;i++) {
			String str =sc.nextLine();
			al.add(str);
		
	
		
		}System.out.println(al);	
		Collections.frequency(al, "str");
		System.out.println((Collections.frequency(al, "sateesh")-1));


	}

}
