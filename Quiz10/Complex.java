package Quiz10;

public class Complex implements Cloneable {

	double a;
	double b;

	public Complex() {
		this.a = 0;
		this.b = 0;
	}

	public Complex(double a) {

		this.a = a;
		this.b = 0;
	}

	public Complex(double a, double b) {

		this.a = a;
		this.b = b;
	}

	public Complex add(Complex second_number) {

		Complex result = new Complex();

		result.a = this.a + second_number.a;
		result.b = this.b + second_number.b;

		return result;

	}

	public Complex subtract(Complex second_number) {
		Complex result = new Complex();

		result.a = this.a - second_number.a;
		result.b = this.b - second_number.b;

		return result;
	}

	public Complex multiply(Complex second_number) {
		Complex result = new Complex();

		result.a = (this.a * second_number.a) - (this.b * second_number.b);
		result.b = (this.a * second_number.b) + (this.b * second_number.a);

		return result;
	}

	public Complex divide(Complex second_number) {
		Complex result = new Complex();

		double val = (Math.pow(second_number.a, 2) + Math.pow(second_number.b, 2));

		result.a = ((this.a * second_number.a) + (this.b * second_number.b)) / val;
		result.b = (this.a * second_number.b) - (this.b * second_number.a) / val;

		return result;
	}

	public double abs() {

		double a_square = Math.pow(this.a, 2);
		double b_square = Math.pow(this.b, 2);
		double sqr_root = Math.sqrt((a_square + b_square));

		return sqr_root;
	}

	public double getRealPart() {
		return this.a;
	}

	public double imaginaryPart() {

		return this.b;
	}

	public String toString() {

		String s = "";

		if (this.b != 0) {
			s = String.valueOf(this.a) + " + " + String.valueOf(this.b) + "i";
		}

		else {
			s = String.valueOf(this.a);
		}
		return s;

	}

}
