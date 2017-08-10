package Lab8;

public class MySet implements MyMath<MySet> {

	private int[] arr;
//	

	public MySet(int[] arr) {

		this.arr = arr;
	}

	public MySet() {

	}

	public int[] getArr() {
		return arr;

	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public MySet add(MySet m1) {
		// TODO Auto-generated method stub
		MySet x = new MySet();
		boolean flag;
		int k = 0;
		int arr[] = new int[m1.arr.length + this.arr.length];

		// x.arr = arr;
		for (int i = 0; i <= m1.arr.length - 1; i++) {
			arr[k] = m1.arr[i];
			k++;
		}

		for (int i = 0; i <= this.arr.length - 1; i++) {
			flag = true;
			for (int j = 0; j <= m1.arr.length - 1; j++) {
				if (this.arr[i] == m1.arr[j]) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				arr[k] = this.arr[i];
				k++;
			}
		}

		x.arr = new int[k];
		for (int i = 0; i <= x.arr.length - 1; i++) {
			x.arr[i] = arr[i];
		}
		
		sort(x.arr);

		return x;
	}

	@Override
	public MySet subtract(MySet m1) {
		MySet x = new MySet();
		boolean flag;
		int k = 0;
		int arr[] = new int[m1.arr.length + this.arr.length];

		for (int i = 0; i <= m1.arr.length - 1; i++) {
			flag = true;
			for (int j = 0; j <= this.arr.length - 1; j++) {
				if (m1.arr[i] == this.arr[j]) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				arr[k] = m1.arr[i];
				k++;
			}
		}

		x.arr = new int[k];
		for (int i = 0; i <= x.arr.length - 1; i++) {
			x.arr[i] = arr[i];
		}
		sort(x.arr);
		return x;
	}

	@Override
	public MySet multiply(MySet m1) {

		MySet x = new MySet();
		boolean flag;
		int k = 0;
		int arr[] = new int[m1.arr.length + this.arr.length];

		for (int i = 0; i <= this.arr.length - 1; i++) {
			flag = true;
			for (int j = 0; j <= m1.arr.length - 1; j++) {
				if (this.arr[i] == m1.arr[j]) {
					flag = false;
					break;
				}
			}

			if (flag == true) {

				arr[k] = this.arr[i];
				k++;
			}
		}

		for (int i = 0; i <= m1.arr.length - 1; i++) {
			flag = true;
			for (int j = 0; j <= this.arr.length - 1; j++) {
				if (this.arr[j] == m1.arr[i]) {
					flag = false;
					break;
				}
			}

			if (flag == true) {

				arr[k] = m1.arr[i];
				k++;
			}
		}

		x.arr = new int[k];
		for (int i = 0; i <= x.arr.length - 1; i++) {
			x.arr[i] = arr[i];
		}
		sort(x.arr);
		return x;

	}

	@Override
	public MySet divide(MySet m1) {
		// TODO Auto-generated method stub
		MySet x = new MySet();
		boolean flag;
		int k = 0;
		int arr[] = new int[m1.arr.length + this.arr.length];

		for (int i = 0; i <= this.arr.length - 1; i++) {
			flag = false;
			for (int j = 0; j <= m1.arr.length - 1; j++) {
				if (this.arr[i] == m1.arr[j]) {
					flag = true;
					break;
				}
			}

			if (flag == true) {

				arr[k] = this.arr[i];
				k++;
			}

		}

		x.arr = new int[k];
		for (int i = 0; i <= x.arr.length - 1; i++) {
			x.arr[i] = arr[i];
		}
		sort(x.arr);
		return x;
	}
	
	public int[] sort(int[] a){
		
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i+1; j <= a.length - 1; j++) {
				if(a[i]>a[j] ){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
		return a;
		
	}
	
	
	

	public String toString() {

		String x = "";
		for (int i = 0; i <= this.arr.length - 1; i++) {
			x += String.valueOf(this.arr[i]);
		}

		// x += "\n";
		return x;

	}

}
