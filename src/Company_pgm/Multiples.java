package Company_pgm;

public class Multiples {
	public static void main(String[] args) {
		int num=45;
		System.out.println(check(num));
			
	}

	private static boolean check(int num) {
		if(num%3==0 && num%5!=0) {
			return true;
		}else if(num%3!=0 && num%5==0) {
			return true;
		}else {
			return false;
		}
	}
}
