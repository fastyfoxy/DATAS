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
		pq.add(patient);
	}

	public ERPatient removeMin()
	{
		return pq.poll();
	}

	public boolean isEmpty()
	{
		return (pq.size()==0);
	}
}