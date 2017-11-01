// Tariq
//
// This program will simulate a game of Hunt the Wompus.

import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class HuntTheWompus extends JApplet
{
	private String wompus = " W ";
	private String slimePit = " S ";
	private JTextArea out = new JTextArea();
	private Container container = getContentPane();
	private String[][] guesses = new String[10][10];
	private String[][] solution = new String[10][10];

	public void init()
	{
		fillSolution();
		fillGuesses();

		print(guesses);

		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JButton cont = new JButton("Continue");
		container.add(cont);

		cont.addActionListener(new ActionListener()
		{
      		public void actionPerformed(ActionEvent e)
			{
				cont();
			}
		});
	}

	public void cont()
	{
		String letter, input;
		int row, col;

		input = JOptionPane.showInputDialog("Enter C or F to check or fire, and a row/column number from 0-9 (ex. 'C12')");

		letter = input.substring(0, 1);
		row = Integer.parseInt(input.substring(1, 2));
		col = Integer.parseInt(input.substring(2));

		if(letter.equalsIgnoreCase("C"))
		{
			if(solution[row][col].equals("[ ]"))		// if element is empty, place x in it's spot
			{
				guesses[row][col] = "[x]";
				out.setText(null);
				print(guesses);
			}
			else if(solution[row][col].equals(" * "))	// if element is a warning spot, uncover it
			{
				guesses[row][col] = " * ";
				out.setText(null);
				print(guesses);
			}
			else										// if element is wompus/slimepit, loss()
				loss();
		}
		else
		{
			if(solution[row][col].equals(wompus))		// if element is wompus, win
				win();
			else
				loss();									// else, loss()
		}
	}

	public void fillGuesses()					   	    //sets up blank grid to store player guesses
	{
		for (int row=0; row<10; row++)
			for (int col=0; col<10; col++)
				guesses[row][col] = "[ ]";
	}

	public void fillSolution()							//sets up wompus, warnings, and slime pit for the solution array
	{
		Random r = new Random();
		int w1 = r.nextInt((8-1)+1)+1;
		int w2 = r.nextInt((8-1)+1)+1;

		System.out.println(w1+"  "+w2);											// TESTER

		for (int row=0; row<10; row++)
			for (int col=0; col<10; col++)
				solution[row][col] = "[ ]";

		solution[w1][w2] = wompus;

		solution[w1-1][w2] = " * ";
		solution[w1-1][w2+1] = " * ";
		solution[w1][w2+1] = " * ";
		solution[w1+1][w2+1] = " * ";
		solution[w1+1][w2] = " * ";
		solution[w1+1][w2-1] = " * ";
		solution[w1][w2-1] = " * ";
		solution[w1-1][w2-1] = " * ";

		int s1 = r.nextInt((8-1)+1)+1;
		int s2 = r.nextInt((8-1)+1)+1;

		System.out.println(s1+"  "+s2);											// TESTER

		while((w1 == s1) && (w2 == s2))
		{
			s1 = r.nextInt((8-1)+1)+1;
			s2 = r.nextInt((8-1)+1)+1;
		}

		solution[s1][s2] = slimePit;
	}

	public void print(String[][] array) 				// prints the array given to it, in grid form
	{
		out.setText(null);
		out.setFont(new Font("Monospaced", Font.PLAIN, 12));

		out.append("   0   1   2   3   4   5   6   7   8   9\n");

		for(int row=0; row<10; row++)
		{
			out.append(row+" ");
			for(int col=0; col<10; col++)
			{
				out.append(array[row][col] + " ");
			}
			out.append("\n");
		}

		container.add(out);
	}

	public void loss()
	{
		JOptionPane.showMessageDialog(null, "You have lost the game!");
		print(solution);
	}

	public void win()
	{
		JOptionPane.showMessageDialog(null, "You have won the game!");
		print(solution);
	}
}