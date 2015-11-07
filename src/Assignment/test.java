package Assignment;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		int seatno;
		Movie cinema = new Movie();
		Scanner sc = new Scanner(System.in);
		cinema.printSeats();
		System.out.println("Choose your row - type -1 to exit");
		choice = sc.next();
		while (!choice.equals("-1")){
			System.out.println("Choose your seat number(1-10) - type -1 to go back");
			seatno = sc.nextInt();
			if (seatno == -1){
				System.out.println("Choose your row - type -1 to exit");
				choice = sc.next();
				continue;
			}
			switch(choice.charAt(0)){
				case 'a':
				case 'A': 
					if (seatno == -1)
						continue;
					else
						cinema.bookSeat(seatno);
					break;
				case 'b':
				case 'B':
					if (seatno == -1)
						continue;
					else
						cinema.bookSeat(seatno+10);
					break;
				case 'c':
				case 'C':
					if (seatno == -1){
						continue;
					}
					else{
						cinema.bookSeat(seatno+20);
					}
					break;
				case 'd':
				case 'D':
					if (seatno == -1){
						continue;
					}
					else{
						cinema.bookSeat(seatno+30);
					}
					break;
				case 'e':
				case 'E':
					if (seatno == -1){
						continue;
					}
					else{
						cinema.bookSeat(seatno+40);
					}
					break;
				case 'f':
				case 'F':
					if (seatno == -1){
						continue;
					}
					else{
						cinema.bookSeat(seatno+50);
					}
					break;
			}
			System.out.println("Choose your row - type -1 to exit");
			choice = sc.next();
				
		}
		cinema.printSeats();
	}

}
