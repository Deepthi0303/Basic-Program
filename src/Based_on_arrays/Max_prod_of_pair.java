package Based_on_arrays;

public class Max_prod_of_pair {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int max = 0;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] * a[j] > max && i != j) {
					max = a[i] * a[j];
					num1 = a[i];
					num2 = a[j];
				}
			}
		}
		System.out.println("Pairs are " + num1 + " and " + num2 + " Product is " + max);

	}
}
