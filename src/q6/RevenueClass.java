package q6;

import java.util.Collections;

public class RevenueClass {
	String RevenueCategory;
	int amount;
	public RevenueClass(String RevenueCategory,int amount)
	{
		this.RevenueCategory=RevenueCategory;
		this.amount= amount;
		
	}
	
	public String getRevenueCategory() {
		return RevenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		RevenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	} 
	
	

}
