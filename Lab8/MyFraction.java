package Lab8;

public class MyFraction implements MyMath<MyFraction> {

	private int numerator;
	private int denominator;
	private char sign;

	public MyFraction(int numerator, int denominator, char sign) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
		this.sign = sign;
	}

	public MyFraction() {

	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	@Override
	public MyFraction add(MyFraction m1) {
		// TODO Auto-generated method stub
		MyFraction x = new MyFraction();
		int den = m1.denominator * this.denominator;
		int num = (m1.numerator * this.denominator * sign(m1)) + (this.numerator * m1.denominator * sign(this));

		if (num > 0) {
			x.sign = '+';
		}

		if (num < 0) {
			x.sign = '-';
			num *= -1;

		}

		if (num == 0) {
			x.sign = '+';
			den = 1;
		}

		for (int i = 2; i <= Math.abs(num) && i <= den; i++) {
			if (num % i == 0 && den % i == 0) {
				num /= i;
				den /= i;
				i = 1;
			}
		}

		x.denominator = den;
		x.numerator = num;

		return x;

	}

	@Override
	public MyFraction subtract(MyFraction m1) {
		// TODO Auto-generated method stub
		MyFraction x = new MyFraction();
		int den = m1.denominator * this.denominator;
		int num = (m1.numerator * this.denominator * sign(m1)) - (this.numerator * m1.denominator * sign(this));

		
		
		
		if (num > 0) {
			x.sign = '+';
		}

		if (num < 0) {
			x.sign = '-';
			num *= -1;
		}

		if (num == 0) {
			x.sign = '+';
			den = 1;
		}

		
		
		for (int i = 2; i <= Math.abs(num) && i <= den; i++) {
			if (num % i == 0 && den % i == 0) {
				num /= i;
				den /= i;
				i = 1;
			}
		}

		x.denominator = den;
		x.numerator = num;

		return x;
	}

	@Override
	public MyFraction multiply(MyFraction m1) {
		// TODO Auto-generated method stub
		MyFraction x = new MyFraction();
		int den = m1.denominator * this.denominator;
		int num = (m1.numerator * sign(m1)) * (this.numerator * sign(this));

		if (num > 0) {
			x.sign = '+';
		}

		if (num < 0) {
			x.sign = '-';
			num *= -1;
		}

		for (int i = 2; i <= Math.abs(num) && i <= den; i++) {
			if (num % i == 0 && den % i == 0) {
				num /= i;
				den /= i;
				i = 1;
			}
		}

		x.denominator = den;
		x.numerator = num;

		return x;
	}

	@Override
	public MyFraction divide(MyFraction m1) {
		// TODO Auto-generated method stub
		MyFraction x = new MyFraction();
		int den = m1.denominator * this.numerator;
		int num = (m1.numerator * sign(m1)) * (this.denominator * sign(this));

		if (num > 0) {
			x.sign = '+';
		}

		if (num < 0) {
			x.sign = '-';
			num *= -1;
		}

		for (int i = 2; i <= Math.abs(num) && i <= den; i++) {
			if (num % i == 0 && den % i == 0) {
				num /= i;
				den /= i;
				i = 1;
			}
		}

		x.denominator = den;
		x.numerator = num;

		return x;
	}

	public int sign(MyFraction x) {

		if (x.sign == '+') {
			return 1;
		} else {
			return -1;
		}

	}

	public String toString() {

		String x;
		if (this.sign == '-') {
			x = this.sign + String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
		}

		else {
			x = String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);

		}
		return x;
	}

}
