package Assignment;

import java.util.Scanner;
public class Moblima {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String choice, userName, password, custName, custEmail;
		long custPhone;
		int seatno, menuChoice, chooseMovie;
		Staff login = new Staff();
		Cineplex[] cineplexes = new Cineplex[3];
		Scanner sc = new Scanner(System.in);
		menuChoice = sc.nextInt();
			while (menuChoice < 5){
			System.out.println("Welcome to Moblima! Please enter a choice:\n" +
					"1. Login as Staff\n" +
					"2. View Movie Listing\n" +
					"3. Make Booking\n" +
					"4. View Booking\n" +
					"5. Exit");
			switch (menuChoice){
				case 1: 
					int ch;
					System.out.println("Please enter username");
					userName = sc.next();
					System.out.println("Please enter password");
					password = sc.next();
					if (login.check(userName, password)){
						System.out.println("Login Successful!"); 
						do{
							System.out.println("\nChoose one option.");
							System.out.println("1. Add a movie.");
							System.out.println("2. Edit the movie details.");
							System.out.println("3. Go back to previous menu.");
							ch = sc.nextInt();
							switch(ch)
							{
								case 1: login.addmovie(cineplexes);
										break;
								case 2: login.updatemovie(cineplexes);
										break;
								case 3: break;
								default: System.out.println("Wrong option choosen.");
							}
						
						}while(ch!=3);
						
						
						
						
						
						
					
						
					}
					else{
						System.out.println("Wrong Username/Password!");
					}
					break;
				case 2:
					for (int i = 0; i < cineplexes.length; i++){
						System.out.println("Cineplex " + i+1 + ":\n");
						cineplexes[i].printMovies();
						System.out.println("");
					}
					
					
					break;
				case 3:
					for (int i = 0; i < cineplexes.length; i++){
						System.out.println("Cineplex " + i+1 + ":\n");
						cineplexes[i].printMovies();
						System.out.println("");
					}
					
					System.out.println("Choose Movie Number to Book:\n");
					chooseMovie = sc.nextInt();
					cineplexes[(chooseMovie-1)/9].chooseCinema(chooseMovie);
					System.out.println("Please enter your name");
					custName = sc.next();
					System.out.println("Please enter your Phone Number");
					custPhone = sc.nextLong();
					System.out.println("Please enter your Email Address");
					custEmail = sc.next();
					
				
			}
		}
	}

}
