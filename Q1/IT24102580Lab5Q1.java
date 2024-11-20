import java.util.Scanner;

public class IT24102580Lab5Q1 {

	public static void main (String...args) {

		Scanner inputInt = new Scanner (System.in) ;
		
		System.out.println ("Enter three integer numbers to see which one is largest and smallest : ");
		int num1 = inputInt.nextInt ();

		int num2 = inputInt.nextInt ();

		int num3 = inputInt.nextInt (); 
		
		System.out.println ("User's inputs are : " +num1+ " " +num2+ " " +num3);

		int largest ;
		int smallest ;

		if ((num1 > num2) && (num1 > num3) && (num2 > num3)) {

			largest = num1;
			smallest = num3;
			System.out.println ("Largest number is : " +largest);
			System.out.println ("Smallest number is : " +smallest);
		
		}else if ((num2 > num3) && (num2 > num1) && (num3 > num1)) {
		
			largest = num2;
			smallest = num1;
			System.out.println ("Largest number is : " +largest);
			System.out.println ("Smallest number is : " +smallest);

		}else {

			largest = num3;
			smallest = num2;
			System.out.println ("Largest number is : " +largest);
			System.out.println ("Smallest number is : " +smallest);
		
		}


		

	}



}



			