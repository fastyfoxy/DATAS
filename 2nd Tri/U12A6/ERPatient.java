// This program will represent an ER patient.

public class ERPatient
{
	private String name;
	private String condition;
	private int priority;

	public ERPatient(String n, String c, int p)
	{
		name = n;
		condition = c;
		priority = p;
	}

	public int getPriority()
	{
		return priority;
	}

	public String toString()
	{
		return name+"\t"+condition+"\t"+priority;
	}

	public boolean compareTo(ERPatient patient)
	{
		return (priority < patient.getPriority());
	}
}