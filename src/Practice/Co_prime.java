package Practice;

import java.util.Scanner;

public class Co_prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		coPrime(n1, n2);
	}

	private static void coPrime(int n1, int n2) {
		int min = Math.min(n1, n2);

		for (int i = 2; i < n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.println("They are not Co Prime");
				return;
			}
		}
		
		System.out.println("They are coPrime");

	}
}
