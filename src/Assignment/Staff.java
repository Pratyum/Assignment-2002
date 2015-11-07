package Assignment;
import java.util.Scanner;

public class Staff {

	private String username;
	private String password;
	
	
	public boolean check(String user, String pass)
	{
		if(user.equals("admin"))
			if(pass.equals("movie"))
					return true;
		return false;
	}	
	Scanner sc = new Scanner(System.in);
	
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
	
	
	public void updatemovie(Movie [] m)
	{
		String name;
		int ch;
		int time;
		String status;
		System.out.println("Enter movie name:");
		name = sc.nextLine();
		for(int i =0; i < m.length ; i++)
			if(name.equals(m[i].getTitle()))
			{
				do{
					System.out.println(" What do you want to do? ");
					System.out.println("1. Change the timings ?");
					System.out.println("2. Change the showing status ? ");
					System.out.println("3. Quit ");
					ch = sc.nextInt();
					switch(ch)
					{
					case 1: System.out.println("Enter the updated time(in 24 hour format, \"hhmm\"): ");
							time = sc.nextInt();
							m[i].setTime(time);
							break;
					case 2: System.out.println("Enter the updated status:");
							status = sc.nextLine();
							m[i].setStatus(status);
							break;
					case 3: break;
					default: System.out.println("Choose the correct choice. ");
					}
				}
				while(ch!=3);
					
				}
			}
		
	
	public void addmovie(Movie m)
	{
		String name,type,rating,showtime, cinema, status, ;
	
		do
		{	
			System.out.println("1. Enter the movie name: ");
			name = sc.nextLine();
			System.out.println("Enter the type (2D/3D): ");
			type = sc.nextLine();
			System.out.println("Enter the showtime: ");
			type = sc.nextLine();
			
			
		}
		while()
		
	}
	
	public void ticketprice(MovieTicket m)
	{
		float price;
		System.out.println("Enter the price:");
		price = sc.nextInt();
		m.setprice(price);
	}
	public void rankmovie()
	{
		
	}
	

	
	

}
	
	

