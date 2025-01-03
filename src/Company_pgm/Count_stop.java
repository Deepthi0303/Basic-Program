package Company_pgm;


public class Count_stop {
	public static void main(String[] args) {
		int[] a= {3,3,13};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==13) {
				break;
			}else {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
