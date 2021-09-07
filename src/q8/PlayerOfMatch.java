package q8;
import java.util.TreeSet;
import java.util.Scanner;

public class PlayerOfMatch {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr the no of matches");
		n= sc.nextInt();
		TreeSet t1= new TreeSet();
		for(int i=0;i<n;i++)
		{
			String str = sc.next();
			t1.add(str);
			
		}System.out.println(t1);
		
		

	}

}
