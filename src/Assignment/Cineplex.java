package Assignment;

public class Cineplex {

	private Cinema[] cin;
	
	public Cineplex(int numHalls)
	{
		cin = new Cinema[numHalls];
		for(int i = 0; i < numHalls; i++)
		{
			cin[i] = new Cinema();
		}
	}
}