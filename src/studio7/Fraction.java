package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
public Fraction(int numerator, int denominator) {
	this.numerator = numerator;
	this.denominator = denominator;
}
public int ComputeDemoninator(Fraction X) {
	return this.denominator*X.denominator;
}
public int CommputeNumerator(Fraction X) {
	return this.denominator*X.numerator + this.numerator*X.denominator;
}
public String Compute() {
	return CommputeNumerator + " / " + ComputeDenominator;
}
	public static void main(String[] args) {
	

	}

}
