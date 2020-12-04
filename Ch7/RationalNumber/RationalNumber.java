package RationalNumber;

public class RationalNumber {
	private int numerator,denominator;
	
	public RationalNumber(int numer,int denom)
	{
		if (denom == 0)  //== compare two number. Make sure the it's a nonzero denominator.
			denom = 1;  
		if(denom < 0)
		{
			//Make the numerator store the sign
			numer = numer * -1;
			denom = denom * -1;
		}
		numerator = numer;
		denominator = denom;
		reduce();
		
	}
	//--------------------------------------------
	//Return the numerator of this rational number.
	//----------------------------------------------
	public int getNumerator()
	{
		return numerator;	
	}
	
	public int getDenominator()
	{
		return denominator; 
	}
	
	public RationalNumber reciprocal () 
	{
		return new RationalNumber(denominator, numerator);
		//A Method of the class may accept an object of the same class as a parameter 
	}
	
	//----------------------------------
	//Adds this rational number to the one passed as a parameter.
	// A common denominator is found by multiplying the individual denominators 
	//------------------------------------
	
	public RationalNumber add (RationalNumber op2) 
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator; 
		int finalNumer = numerator1 + numerator2;
		return new RationalNumber (finalNumer, commonDenominator); //Don't forget instiate a new object
	}
	
	public RationalNumber subtract (RationalNumber op3) 
	{
		int commonDenominator = denominator * op3.getDenominator();
		int numerator1 = numerator * op3.getDenominator();
		int numerator2 = op3.getNumerator() * denominator; 
		int difference = numerator1 - numerator2;
		return new RationalNumber (difference, commonDenominator);
	}
	
	public RationalNumber multiply( RationalNumber op2) {
		int productDenominator = denominator * op2.getDenominator();
		int proNumerator = numerator * op2.getNumerator();
		return new RationalNumber(proNumerator, productDenominator);
	}
	
	public RationalNumber divide(RationalNumber op2) {
		//int divi = RationalNumber * op2.reciprocal();
		//return new RantionalNumber();
		//should be write in the following way
		return multiply(op2.reciprocal());
	
	}
	//------------------
	//Determines if this rational number is equal to the one passes as 
	// a parameter. Assumes they are both reduced.
	//---------------------------------
	public boolean isLike(RationalNumber op2) {
		return(denominator == op2.getDenominator() &&  
				numerator == op2.getNumerator());
	}
	
	//-------------------------------------------
	//Return this rational number as a string.
	//-----------------------------------------
	public String toSthring() 
	{
		String result;
		if (numerator == 0)
			result = "0";
		if (denominator == 1) 
			result = numerator + "";
		else
			result = numerator + "/" + denominator;
		return result;
	}
	//---------------------------------------------
	//
	//-------------------------------------------
	private void reduce() {
		if (numerator != 0)
		{
			int common = gcd(Math.abs(numerator), denominator);
			numerator = numerator / common;
			denominator = denominator / common;
		}
		
	}
	private int gcd(int num1, int num2)
	{
		while (num1 != num2)
			if(num1 != num2)
				num1 = num1 - num2;
			else 
				num2 = num2 - num1;
		return num1;
	}
	
}
