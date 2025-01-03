package Based_on_Numbers;

public class Sum_of_Factors {
public static void main(String[] args) {
	int n=10;
	sum_fact(n);
}

private static void sum_fact(int n) {
	int sum=0;
	for(int i=1;i<10;i++) {
		if(n%i==0) {
			sum+=i;
		}
	}
	System.out.println(sum);
}
}
