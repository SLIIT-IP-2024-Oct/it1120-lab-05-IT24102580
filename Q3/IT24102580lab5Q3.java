import java.util.Scanner ;

	public class IT24102580lab5Q3 {

		public static final double roomRent = 48000 ;
		public static final double dis1 = 10 ;
		public static final double dis2 = 5 ;
			
			public static void main (String...args) {
			
			System.out.println ("Welcome to the online reservation site of Ransiri resort.\n") ;
			
			Scanner sc = new Scanner (System.in) ;
			System.out.println ("When would you like to reserve a room or rooms (1 - 31) ? ") ;
			int startDate = sc.nextInt ();

			System.out.println ("Could you please tell us what is your planned check out date (1 - 31) ? ");
			int endDate = sc.nextInt ();
			
			int daysReserved = endDate - startDate ;

			 if ((startDate >= 1 && endDate <= 31) && startDate < endDate ) {

				if (daysReserved < 3) {
							double amount2 = daysReserved * roomRent; 
							System.out.println ("Your total amount is : " +amount2) ;

				} else if (daysReserved == 3 || daysReserved < 5 ) {

							double amount = daysReserved * roomRent ;
							double disforAmount = amount / dis1 ;
							double amountwithDis = amount - disforAmount ;
					
							System.out.println ("Your total amount is : " +amountwithDis) ;
				
				} else if (daysReserved >= 5) {

					
							double amount1 = daysReserved * roomRent ;
							double disforAmount1 = amount1 / dis2 ;
							double amountwithDis1 = amount1 - disforAmount1 ;

							System.out.println ("Your total amount is : " +amountwithDis1) ;
		
				} else {

							System.out.println ("Sorry we only rent our room for 24 hours or more than it" ) ;
		
				}

			} else {

			
							
							System.out.println ("Oops invalid date or End date must be greater than Start date." ) ;
			}


	}


}


			
				

		