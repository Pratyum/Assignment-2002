package Assignment;

public class Cinema {

	private String movieClass;
	private String code;
	private Movie[] timeSlots;
	
	public Cinema()
	{
		movieClass = null;
		code = null;
		timeSlots = new Movie[3];
	}
	
	public Cinema(String MClass, String c, Movie[] m) throws StackOverflowError
	{
		movieClass = MClass;
		code = c;
		for (int i = 0; i < 3; i++)
		{
			if (m[i].getTitle() != null)
			{
				timeSlots[i] = m[i];
			}
		}
	}
	
	public String getMovieClass()
	{
		return movieClass;
	}
	
}
