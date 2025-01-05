package Practice;

import java.util.Scanner;

public class Harshard_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		int sum = 0;
		while (copy != 0) {
			int rem = copy % 10;
			sum += rem;
			copy /= 10;
		}

		System.out.println(sum);
		if (n % sum == 0) {
			System.out.println("Harshard Number");
		} else {
			System.out.println("Not Harshard Number");
		}
	}
}
