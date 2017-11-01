// This class multiplies and simplifies polynomials using LinkedLists.

import java.util.LinkedList;
import java.util.ListIterator;

public class U11A1
{
	public static void main(String[] args)
	{
		U11A1 app = new U11A1();
	}

	public U11A1()
	{
		LinkedList<Term> poly1 = new LinkedList<Term>();
		poly1.addLast(new Term(2, 1));
		poly1.addLast(new Term(5, 0));

		LinkedList<Term> poly2 = new LinkedList<Term>();
		poly2.addLast(new Term(3, 2));
		poly2.addLast(new Term(-7, 1));
		poly2.addLast(new Term(4, 0));

		print(combine(multiply(poly1, poly2)));
	}

	public LinkedList<Term> multiply(LinkedList<Term> a, LinkedList<Term> b)
	{
		LinkedList<Term> product = new LinkedList<Term>();

		for(Term x : a)
			for(Term y : b)
				product.addLast(new Term(x.getCoef()*y.getCoef(),x.getExp()+y.getExp()));

		return product;
	}

	public LinkedList<Term> combine(LinkedList<Term> list)
	{
		LinkedList<Term> sol = new LinkedList<Term>();
		LinkedList<Term> exp0 = new LinkedList<Term>();
		LinkedList<Term> exp1 = new LinkedList<Term>();
		LinkedList<Term> exp2 = new LinkedList<Term>();
		LinkedList<Term> exp3 = new LinkedList<Term>();
		int coef = 0;
		int exp = 0;

		for(Term x : list)
		{
			if(x.getExp() == 0) exp0.addLast(x);
			else if(x.getExp() == 1) exp1.addLast(x);
			else if (x.getExp() == 2) exp2.addLast(x);
			else exp3.addLast(x);
		}

		for(Term x : exp3)
		{
			coef += x.getCoef();
			exp = x.getExp();
		}
		sol.addLast(new Term(coef, exp));

		coef = 0;
		for(Term x : exp2)
		{
			coef += x.getCoef();
			exp = x.getExp();
		}
		sol.addLast(new Term(coef, exp));

		coef = 0;
		for(Term x : exp1)
		{
			coef += x.getCoef();
			exp = x.getExp();
		}
		sol.addLast(new Term(coef, exp));

		coef = 0;
		for(Term x : exp0)
		{
			coef += x.getCoef();
			exp = x.getExp();
		}
		sol.addLast(new Term(coef, exp));

		return sol;
	}

	public void print(LinkedList<Term> list)
	{
		for(Term x : list)
			if(x.getCoef() == list.peekFirst().getCoef())
				System.out.print(x.getCoef()+"X^"+x.getExp());
			else
				if(x.getCoef() > 0)
					System.out.print(" + "+x.getCoef()+"X^"+x.getExp());
				else
					System.out.print(" - "+(x.getCoef()*-1)+"X^"+x.getExp());

		System.out.println();
	}
}