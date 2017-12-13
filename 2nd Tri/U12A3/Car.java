// This interface will represent a car in a carwash.

public class Car
{
	private int arrival, departure, wait_time;

	public Car(int min)
	{
		arrival = min;
		departure = 0;
		wait_time = 0;
	}

	public int getArrival()
	{
		return arrival;
	}

	public void setDeparture(int x)
	{
		departure = x;
	}

	public int getDeparture()
	{
		return departure;
	}

	public int getWaitTime()
	{
		return departure-arrival;
	}

}
