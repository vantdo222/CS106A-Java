/*
 * The Rational class is used to represent rational numbers, which
 * are defined to be the quotient of two integers.
 */
public class Rational {

	// Public constants
	
	// Private instance variables
	private int num;      // The numerator of this Rational
	private int den;      // The denominator of this Rational
	
	// Creates a new Rational initialized to zero.
	public Rational() {
		this(0);
	}
	
	/**
	 * Creates a new Rational from the integer argument.
	 * @param n the initial value
	 */
	public Rational(int n) {
		this(n, 1);
	}
	
	/**
	 * Creates a new Rational with the value x/y.
	 * @param x The numerator of the rational number
	 * @param y The denominator of the rational number
	 */
	public Rational(int x, int y) {
		int g = gcd(Math.abs(x), Math.abs(y));
		num = x / g;
		den = Math.abs(y) / g;
		if (y < 0) num = -num;
	}
	
	/**
	 * Adds the rational number r to this one and returns the sum.
	 * @param r The rational number to be added
	 * @return The sum of the current number and r 
	 */
	public Rational add(Rational r) {
		return new Rational(this.num * r.den + r.num * this.den,
							this.den * r.den);
	}
	
	/**
	 * Subtracts the rational number r from this one.
	 * @param r The rational number t be subtracted
	 * @return The result of subtracting r from the current number
	 */
	public Rational subtract(Rational r) {
		return new Rational(this.num * r.den - r.num * this.den,
							this.den * r.den);
	}
	
	/**
	 * Multiplies this number by the rational number r.
	 * @param r The rational number used a a multiplier
	 * @return the result of multiplying the current number r
	 */
	public Rational multiply(Rational r) {
		return new Rational(this.num * r.num, this.den * r.den);
	}
	
	/**
	 * Divides this number by the rational number r.
	 * @param r The rational number used as divisor
	 * @return The result of dividing the current number by r
	 */
	public Rational divide(Rational r) {
		return new Rational(this.num * r.den, this.den * r.num);
	}
	
	/**
	 * Creates a string representation of this rational number.
	 * @return The string representation  of this rational number
	 */
	public String toString() {
		if (den == 1) {
			return "" + num;
		} else {
			return num + "/" + den;
		}
	}
	
	/**
	 * Calculates the greatest common divisor using Euclid's algorithm.
	 * @param x First integer
	 * @param y Second integer
	 * @return The greatest common divisor of x and y
	 */
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
}
