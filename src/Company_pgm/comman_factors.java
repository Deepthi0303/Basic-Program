package Company_pgm;


public class comman_factors {
	public static void main(String[] args) {
		int a=20;
		int b=90;
		int num=Math.min(a, b);
		for (int i = 2; i <= num; i++) {
			if(a%i==0 && b%i ==0 &&isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isPrime(int i) {
		boolean flag=true;
		for (int j = 2; j < i ; j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
