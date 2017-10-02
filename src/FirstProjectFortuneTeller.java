import java.util.Scanner;
public class FirstProjectFortuneTeller {

	public static void main(String[] args) {
//		Ask the user for the user’s first name.
//		 Ask the user for the user’s last name.
//		 Ask the user for the user’s age.
//		 Ask the user for the user’s birth month (as an 'int').
//		 Ask the user for the user’s favorite ROYGBIV color.
//		 If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
//		 Ask the user for the user's number of siblings.
		Scanner input = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String color;
		int siblings;
		
		System.out.println("Enter your first name:");
		firstName = input.nextLine().toLowerCase();
		System.out.println("Please enter your last name:");
		lastName = input.nextLine().toLowerCase();
		System.out.println("Please enter your age:");
		age = input.nextInt();
		System.out.println("Please enter your birth month as an integer. For example, December would be 12.");
		birthMonth = input.nextInt();
		input.nextLine();
		System.out.println("What is your ROYGBIV color? If you do not know what ROYBIV is please type " + "\"Help.\"");
		color = input.nextLine().toLowerCase();
		
		if(color.toLowerCase().contains("help")) {
	        System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet make up ROYGBIV. Get it?");
	        System.out.println("What is your ROYGBIV color? If you do not know what ROYBIV is please type " + "\"Help.\"");
			color = input.nextLine().toLowerCase();
		}
		
		System.out.println("How many siblings do you have?");
	    siblings = input.nextInt();
		
		/// Step one complete! On to step two. *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
		// a vacation home in *[location]*, and travel by *[mode of transporation]*.
			
		String retirement;
		String oddAge = "21 years";
		String evenAge = "22 years";
		
		if ((age % 2) > 0 ) {
			retirement = oddAge ;
		} else {
			retirement = evenAge;
		}
			
	
		
		//AGE & Retirement section complete. Ugh. Moving on to siblings and vacation; with options for less than zero to greater than 3
		
		String vacation;
		if (siblings == 0) {
			vacation = "New York City";
		} else if (siblings == 1) {
			vacation = "The Grand Canyon";
		} else if (siblings == 2) {
			vacation = "Austin, TX";
		} else if (siblings == 3) {
			vacation = "Seatle, WA";
		} else if (siblings > 3) {
			vacation = ("Vermont");
		} else if (siblings < 0) {
		    vacation = ("Florida");
		} else {
			vacation = "You screwed up.";
		}
		    
		
		     
		// Now coding in colors and modes of transportation 
		    
		  String transport;
		  if (color.toLowerCase().contains("red")) {
			  transport = "piggy back";
		  } else if (color.toLowerCase().contains("orange")) {
			  transport = "dragon";
		  } else if (color.toLowerCase().contains("yellow")) {
			  transport = "motorcycle";
		  } else if (color.toLowerCase().contains("green")) {
			  transport = "skateboard";
		  } else if (color.toLowerCase().contains("blue")) {
			  transport = "car";
		  } else if (color.toLowerCase().contains("indigo")) {
			  transport = "Seqway";
		  }else if (color.toLowerCase().contains("violet")) {
			  transport = "the Millenium Falcon";
		  } else {
			  transport = "You entered ROYGBIV color incorrectly.";
		  }
		
			  
	// The user's bank balance at retirement will be based on the user's birth month.
	//If the user enters something other than 1-12 for birth month, the user's balance will be $0.00.
	
	 String savings;
	 switch (birthMonth) {
	 case 1:
	 case 2:
	 case 3:
	 case 4:
	 savings = "$500,000";
	 break;
	 case 5:
	 case 6:
	 case 7:
	 case 8:
	 savings = "$600,000";
	 break; 
	 case 9:
	 case 10:
	 case 11:
	 case 12:
	 savings = "$1,000,000";
	 break;
	 default:
	 savings = "$500";
	 }
	 
	
	 
	 System.out.println(firstName + " " + lastName + " will retire in " + retirement + " with " + savings + " in the bank, a vacation home in "
	 + vacation + ", and travel by" + transport);
	 

	 
	
	
	
		 
	 }
			  
		  
			  
			  
			  
	
			
		
		
		
				
		
		
		
		
		
}
	
	 
//}

