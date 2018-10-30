package com.sharetrade;

public class StockProblem {
	 int maxProfit(int price[], int arr_size)  
	    { 
	        int max_price = price[1] - price[0]; 
	        int min_element = price[0]; 
	        int i; 
	        for (i = 1; i < arr_size; i++)  
	        { 
	            if (price[i] - min_element > max_price) 
	            	max_price = price[i] - min_element; 
	            if (price[i] < min_element) 
	                min_element = price[i]; 
	        } 
	        return max_price; 
	    } 
	public static void main(String[] args) {
		StockProblem stockproblem = new StockProblem(); 
        int price[] = {4, 10, 5, 12, 1, 3, 11, 9, 1, 2}; 
        int size = price.length; 
        System.out.println("Maximum Profit is " +  
        		stockproblem.maxProfit(price, size)); 
	}

}
