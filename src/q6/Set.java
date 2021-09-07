package q6;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import sun.jvm.hotspot.debugger.cdbg.LoadObjectComparator;

public class Set  {

	public static void main(String []args) {
		String RevenueCategory,option;
		int amount,total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the revenue category");
		RevenueCategory = sc.nextLine();
		System.out.println("enter the amount");
		amount =  sc.nextInt();
		TreeSet<RevenueClass>t= new TreeSet<RevenueClass>();
//		System.out.printf("enter the  revenuecatrgory");
//		String  n = sc.next();
//		System.out.printf("enetr the revenue  amount " );
//		 int amount = sc.nextInt();
//		 System.out.printf("say yes or no for conditon");
//		 String str=sc.nextLine();
//		 System.out.printf("DO you want continue yes/no" );
//		 String y=sc.nextLine(); 
//		 
//		 
	     do
	     {
	    	  System.out.println("netr the revenue  category");
	    	  RevenueCategory= sc.nextLine();
	    	  System.out.println("eneter the amount ");
	    	  amount = sc.nextInt();
	    	  t.add(new RevenueClass(RevenueCategory,amount));
	    	  System.out.println("Do  u want continue yes/no");
	    	  
	    	  option = sc.nextLine();
					total = amount+amount;
		
					 
		 } while(option.equals("yes"));
		System.out.println(total);
						 
		 	
		 
		
	     
	     
		
	}

}
