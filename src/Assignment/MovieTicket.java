package Assignment;

public class MovieTicket extends Movie{
	
	private String name;
	private String email;
	private String phno;
	private int age;
	private double price;
	private boolean assigned;
	private String TID;
	private int seatID;
	public boolean getAssigned(){
		return assigned;
	}
	public void setAssigned(){
		assigned = true;
	}
	public void calculatePrice(){
		if (showStatus == "Preview"){
			price = 50.0;
			return;
		}
		if (age<=13 || age>=60)
			switch(cinemaType){
			case 'N': 	price = baseRate;
						if (movieType == 3)
							price ++;
						if (showDay == 'H')
							price ++;
						break;
			case 'P': 	price = baseRate + 2;
						if (movieType == 3)
							price ++;
						if (showDay == 'H')
							price ++;
						break;			
			}
		else
			switch(cinemaType){
			case 'N': 	price = baseRate + 1;
						if (movieType == 3)
							price ++;
						if (showDay == 'H')
							price ++;
						break;
			case 'P': 	price = baseRate + 3;
						if (movieType == 3)
							price ++;
						if (showDay == 'H')
							price ++;
						break;			
			}
	}
	public double getPrice(){
		return price;
	}
	public void produceTID(){
		
	}
}