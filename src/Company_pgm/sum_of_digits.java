package Company_pgm;

public class sum_of_digits {
	public static void main(String[] args) {
		int a=7456;
		int sum=0;
		while (a!=0) {
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		
		System.out.println(sum);
	}
}
