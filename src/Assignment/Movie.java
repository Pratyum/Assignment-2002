package Assignment;


public class Movie {
	private MovieTicket[] seats = new MovieTicket[30];
	protected String title, showStatus;
	private String synopsis, director;
	protected double baseRate;
	private String[] cast;
	private Review[] feedback = new Review[20];
	protected char cinemaType;
	// P - PlatinumClass
	// N - Normal
	protected int movieType;
	// 2 - 2D
	// 3 - 3D
	protected char showDay;
	// W - Weekend
	// H - Holiday
	protected int showTime, showDate; 
	private int totalRating;
	private double sales;
	private int i = 0;
	private int seatRow;
	
	public Movie(){
		for (i = 0; i < seats.length; i++){
			seats[i] = new MovieTicket();
		}
	}
	
	public void printSeats(){
		seatRow = 65; // 65 is ASCII "A"
		// screen
		System.out.println("|			Screen			|");
		System.out.println("\n");
		// number of rows
		for (int i = 0; i < (seats.length/10);i++){
			System.out.print((char)seatRow + "	");
			for (int j = 0;j < 10;j++){
				// center stairs
				if (j == 10/2){
					System.out.print("   ");
				}
				
				System.out.print("|");
				
				if (seats[j+(i*10)].getAssigned() == true){
					System.out.print("X");
				}
				else {
					System.out.print("_");
				}
				System.out.print("|");
			}
			System.out.print("	" + (char)seatRow + "\n");
			seatRow++;
			
		}
		System.out.println("\n		  | Entrance |	\n");
		System.out.println("Additional Information:\n"
				+ "X - seat is occupied\n"
				+ "Seat Numbers: 1 - 10 from left to right\n");
	}
	
	public void bookSeat(int seatid){
		seats[seatid-1].setAssigned();
	}

	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setStatus(String status){
		this.showStatus = status;
	}
	
	public void setSynop(String synop){
		this.synopsis = synop;
	}
	
	public void setDirector(String director){
		this.director = director;
	}
	
	public void setCast(String[] cast){
		for (i = 0;i < cast.length; i++){
			this.cast[i] = cast[i];
		}
		
		while(i < (this.cast).length){
			if (!this.cast[i].equals("null")){
				this.cast[i] = "null";
			}
					
		}
	}
	
	public void setCinemaType(char type){
		this.cinemaType = type;
	}
	public void setMovieType(char type){
		this.movieType = type;
	}
	public void setFeedback(String fb, int rating){
		for(i = 0; i < feedback.length; i++){
			if(feedback[i].getRating() == 0){
				feedback[i].setDesc(fb);
				feedback[i].setRating(rating);
				break;
			}
		}
		
	}
	
	public void setTime(int time){
		showTime = time;
	}
	
	public void setDate(int date){
		showDate = date;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getStatus(){
		return showStatus;
	}
	
	public String getSynop(){
		return synopsis;
	}
	
	public String getDirector(){
		return director;
	}
	
	public void printCast(){
		System.out.println("The cast of the movie are: ");
		for (i = 0;i < cast.length; i++){
			if(cast[i].equals("null")){
				break;
			}
			else {
				System.out.print(cast[i]+ ", ");
			}
		}
		System.out.println("\n");
	}
	
	public int getMovieType(){
		return movieType;
	}
	public char getCinemaType(){
		return cinemaType;
	}
	public double calculateTotalSales(int price){
		sales = 0.0;
		for (i = 0; i < (seats.length);i++){
			if (seats[i].getAssigned())
				sales += seats[i].getPrice();
		}
		return sales;
	}
	
	public int overallRating(){
		totalRating = 0;
		for(i = 0; i < feedback.length; i++){
			if (feedback[i].getRating() == 0)
				break;
			else
				totalRating += feedback[i].getRating();
		}
		return totalRating;
	}
}
