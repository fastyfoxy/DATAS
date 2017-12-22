// This program will simulate the operation of a car wash for 10 hours.

import java.util.Random;

public class U12A3
{
	private ListQueue queue = new ListQueue();

	public static void main(String[] args)
	{
		U12A3 app = new U12A3();
	}

	public U12A3()
	{
		System.out.println("Simulation 1:");
		simulate(0.25, 5.0);
		System.out.println("\n\nSimulation 2:");
		simulate(0.25, 4.0);
	}

	public void simulate(double prob_of_arrival, double time_for_wash)
	{
		Random generator = new Random();
		double average_wait_time = 0.0;
		int cars_washed = 0;
		int c = 0;

		for (int min=1; min<=600; min++)
		{
			if(generator.nextDouble() < prob_of_arrival)
				 queue.enqueue(min);

			if(!queue.isEmpty())
				if (c!=0 && c%time_for_wash==0)
				{
					average_wait_time += min - ((Integer)queue.dequeue()).intValue();
					cars_washed++;
				}
				else
					c++;
		}

		System.out.println("Car Wash Time\t\t= "+(int)time_for_wash+" mins");
		System.out.println("Probability of Arrival\t= "+prob_of_arrival);
		System.out.println("Numbers of cars washed\t= "+cars_washed);
		System.out.println("Average wait in Queue\t= "+(int)average_wait_time+" mins");
	}
}

/*
OUTPUT:

Simulation 1:
Car Wash Time           = 5 mins
Probability of Arrival  = 0.25
Numbers of cars washed  = 143
Average wait in Queue   = 26 mins
Average wait in Queue   = 16 mins


Simulation 2:
Car Wash Time           = 4 mins
Probability of Arrival  = 0.25
Numbers of cars washed  = 144
Average wait in Queue   = 8 mins

*/
