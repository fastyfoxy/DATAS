// This class will contain terms of a polynomial.

public class Term
{
	private int coefficient;
	private int exponent;

	public Term(int coef, int exp)
	{
		coefficient = coef;
		exponent = exp;
	}

	public int getCoef()
	{
		return coefficient;
	}

	public int getExp()
	{
		return exponent;
	}
}