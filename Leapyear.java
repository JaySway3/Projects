package code;

import java.util.Scanner;

public class Leapyear {
	 public static void main(String[] args)
	    {
			  
			  
			    Scanner in = new Scanner ( System.in );
			    System.out.println ( "1) Option 1\n2) Option 2");
			    System.out.print ( "Selection: " );
			    switch ( in.nextInt()){
			    
			    			
			      case 1:
			    	  int year;
			    		
				        Scanner scanner = new Scanner(System.in);
				        System.out.print(" Enter a Leap Year: ");
				        year = scanner.nextInt();
				 
				      
				        if ((year % 400 == 0)
				            || ((year % 4 == 0) && (year % 100 != 0))) {
				           
				            System.out.print(year + " is a Leap Year");
				        }
				 
				        else {
				           
				            System.out.print(year + " is not a Leap Year");
			        
			        break; }
			      case 2:
			    		      String counter = "Deutschland";
			    		      int count = 0;
			    		      System.out.println("Number of Letters: "+counter);
			    		      for (int a = 0; a < counter.length(); a++) {
			    		         if (Character.isLetter(counter.charAt(a)))
			    		         count++;
			    		      }
			    		      System.out.println("Letters: "+count);
			        break;
	        
			    		   }
			    	  }
				   
}

			