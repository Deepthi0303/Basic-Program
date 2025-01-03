	package Based_on_Numbers;
	
	public class Reverse_integer {
	public static void main(String[] args) {
		int num=123456;
		int rem=0;
		int rev=0;
		while(num!=0) {
			rem=num%10;         //6  5
			rev=rev*10+rem;      //  60    65
			num/=10;
		}
		System.out.println(rev);
	}
	}
