package Based_on_Numbers;

public class Integer_to_Binary {
	public static void main(String[] args) {
		int n=10;
		StringBuilder binary=new StringBuilder();
		while(n!=0) {
			int rem=n%2;
			binary.insert(0,rem);
			n/=2;
		}
		System.out.println(binary);
	}
}
