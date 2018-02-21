// This program will test the methods of the ERPatient and MyPriorityQueue classes.

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class U12A6
{
	private MyPriorityQueue queue = new MyPriorityQueue();

	public static void main(String[] args)
	{
		U12A6 app = new U12A6();
	}

	public U12A6()
	{
		try
		{
			System.out.println("Patient Name\tCondition\tPriority\tPhysician");
			System.out.println("------------\t---------\t--------\t---------");

			Scanner in = new Scanner(new File("ER.txt"));

			while(in.hasNext())
			{
				String input = in.nextLine();
				StringTokenizer st = new StringTokenizer(input);

				if(input.substring(0,1).equals("P"))
				{
					st.nextToken();

					String n = st.nextToken()+" "+st.nextToken();
					String c = st.nextToken()+" "+st.nextToken();
					int p = Integer.parseInt(st.nextToken());

					queue.add(new ERPatient(n, c, p));
				}
				else
				{
					st.nextToken();
					System.out.println(queue.removeMin()+"\t\t"+st.nextToken());
				}
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		System.out.println("\n\nUntreated Patients");
		System.out.println("------------------");

		while(!queue.isEmpty())
		{
			System.out.println(queue.removeMin());
		}
	}
}

/*
OUTPUT:

Patient Name    Condition       Priority        Physician
------------    ---------       --------        ---------
Jones, James    Chest Pains     1               Adams
Moore, Tanya    Trbl Breathing  2               Patel
Thomas, Renee   Head Injury     1               Adams
Weiss, Alex     Cmpnd Fracture  2               Patel
Francis, Mary   Punct Lung      1               Patel
Cooper, Paul    Freq Vomitting  2               Adams
Collins, Peter  Broken Arm      3				Patel
Smith, Alice    Nose Bleed     3				Adams


Untreated Patients
------------------
Jacobs, Abel    Trbl Urinating  3
Stuart, Robert  Skin Laceration 3
Drejas, David   Mild Senioritis 3
Cole, Jacob     Computer Injury 3

*/
