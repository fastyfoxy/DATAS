// This program will run a priority queue of ER patients.

import java.util.PriorityQueue;
import java.util.ArrayList;

public class MyPriorityQueue
{
	private PriorityQueue<ERPatient> pq;

	public MyPriorityQueue()
	{
		pq = new PriorityQueue<ERPatient>();
	}

	public void add(ERPatient patient)
	{
		add(patient);

		// go thru the queue from lowest priority to highest
		// comparing the getPriority()'s of the patients
		// once the priority is the same place them there

		// inside priorities FIFO
	}

	public void removeMin()
	{
		pq.poll();
	}

	public boolean isEmpty()
	{
		return (pq.size()==0);
	}
}