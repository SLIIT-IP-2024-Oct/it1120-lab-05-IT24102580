import java.util.Scanner ;

public class IT24102580lab5Q2 {

	public static void main (String...args) {

	Scanner sc = new Scanner (System.in) ;
	System.out.println ("Welcome to our prormotion event!\n");
	
	System.out.println ("Enter how many new members has you introduced to our company : ");
	int quantityofmemebers = sc.nextInt () ;

	switch (quantityofmemebers)

	{
		
		case 0 :

				System.out.println ("Better luck next time.");
				
				break;
		case 1 : 
			
				
				System.out.println ("congrats! You are entitled to a : pen.");

				break;
		
		case 2 :
			
				System.out.println ("congrats! You are entitled to a : Umbrella.");

				break;
		
		case 3 : 
			
				System.out.println ("congrats! You are entitled to a : Bag.");

				break;

		case 4 : 
			
				System.out.println ("congrats! You are entitled to a : Travelling chair.");

				break;
		
		case 5  : 
			
				System.out.println ("congrats! You are entitled to a : Headphone.");

				break;

		
		default :
				System.out.println ("Input must be Zero or greater than Zero.");
				
				break;
	}



  }	


}



