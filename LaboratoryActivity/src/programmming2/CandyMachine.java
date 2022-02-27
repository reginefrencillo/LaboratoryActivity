package programmming2;

import java.util.Scanner;

import java.util.ArrayList;
public class CandyMachine {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		System.out.println("WELCOME TO CANDY MACHINE");
	    System.out.println();
	    System.out.println("Hi! Here are the Products: ");
	    System.out.println();  
	    
	    ArrayList category = new ArrayList();
	    category.add("CANDIES");
	    category.add("CHIPS");
	    category.add("COOKIES");
	    category.add("GUMS");
	    System.out.println(category);
	    System.out.println();
	    
	    System.out.print("Please Select One Product :");
	    String select = r.nextLine();
	    System.out.println();
	   
	    int candy = 10;
	    int chips = 39;
	    int cookies = 55;
	    int gums = 5;
	    int payment = 100;
	    
	   if (select.equalsIgnoreCase("candies")) {
		   System.out.println("Candies are worth " + candy +".00");
 		   System.out.println("Would You like to Purchase it?");
 		   System.out.println();
 		   System.out.print("YES or NO : ");
 		   String candychoose = r.nextLine();
 		    if (candychoose.equalsIgnoreCase("YES")) {
 		    	System.out.println();
 		    	System.out.print("Please input your Payment (100.00 is the only Valid Amount.) : ");
 		    	int pays = r.nextInt();
 		    	
 		    	if (pays >=0 && pays <=100) {
 		    		System.out.println("Thank You for Your Purchased!");
 		    		System.out.println("Here's your Change : " + (payment - candy) +".00");
 		    		System.out.println("Come Back Again!");
 		    	}
 		    }else if(candychoose.equalsIgnoreCase("no")){
 		    		System.out.println("Okay, Thank You!.");
 		    		}else System.out.println("Invalid Selection!");
		   
	   }else if(select.equalsIgnoreCase("chips")) {
		   System.out.println("Chips are worth " + chips +".00");
 		   System.out.println("Would You like to Purchase it?");
 		   System.out.println();
 		   System.out.print("YES or NO : ");
 		   String chipchoose = r.nextLine();
 		    if (chipchoose.equalsIgnoreCase("YES")) {
 		    	System.out.println();
 		    	System.out.print("Please input your Payment (100.00 is the only Valid Amount.) : ");
 		    	int pays = r.nextInt();
 		    	
 		    	if (pays >=0 && pays <=100) {
 		    		System.out.println("Thank You for Your Purchased!");
 		    		System.out.println("Here's your Change : " + (payment - chips) +".00");
 		    		System.out.println("Come Back Again!");
 		    	}
 		    }else if(chipchoose.equalsIgnoreCase("no")){
 		    		System.out.println("Okay, Thank You!.");
 		    		}else System.out.println("Invalid Selection!");
		   
	   }else if(select.equalsIgnoreCase("cookies")) {
		   System.out.println("Cookies are worth " + cookies +".00");
 		   System.out.println("Would You like to Purchase it?");
 		   System.out.println();
 		   System.out.print("YES or NO : ");
 		   String cookieschoose = r.nextLine();
 		    if (cookieschoose.equalsIgnoreCase("YES")) {
 		    	System.out.println();
 		    	System.out.print("Please input your Payment (100.00 is the only Valid Amount.) : ");
 		    	int pays = r.nextInt();
 		    	
 		    	if (pays >=0 && pays <=100) {
 		    		System.out.println("Thank You for Your Purchased!");
 		    		System.out.println("Here's your Change : " + (payment - cookies) +".00");
 		    		System.out.println("Come Back Again!");
 		    	}
 		    }else if(cookieschoose.equalsIgnoreCase("no")){
 		    		System.out.println("Okay, Thank You!");
 		    		}else System.out.println("Invalid Selection!");
		   
		   
	   }else if(select.equalsIgnoreCase("gums")) {
		   System.out.println("Gums are worth " + gums +".00");
 		   System.out.println("Would You like to Purchase it?");
 		   System.out.println();
 		   System.out.print("YES or NO : ");
 		   String gumchoose = r.nextLine();
 		    if (gumchoose.equalsIgnoreCase("YES")) {
 		    	System.out.println();
 		    	System.out.print("Please input your Payment (100.00 is the only Valid Amount.) : ");
 		    	int pays = r.nextInt();
 		    	
 		    	if (pays >=0 && pays <=100) {
 		    		System.out.println("Thank You for Your Purchased!");
 		    		System.out.println("Here's your Change : " + (payment - gums) +".00");
 		    		System.out.println("Come Back Again!");
 		    	}
 		    }else if(gumchoose.equalsIgnoreCase("no")){
 		    		System.out.println("Okay, Thank You!");
 		    		}else System.out.println("Invalid Selection!");
		   
	   }else System.out.println("Invalid Selection!");
	
		    		
	
}

}