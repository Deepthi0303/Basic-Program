package Based_on_arrays;

public class Sum_of_pairs_equal_to_number {
public static void main(String[] args) {
	int[] a = { 1, 2, 3, 4, 5};
	int num = 9;
	int num1 = 0;
	int num2 = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i] + a[j] == num && i != j) {
				num1 = a[i];
				num2 = a[j];
				System.out.println("Pairs are " + num1 + " and " + num2);
			}
		}
	}
}
}
