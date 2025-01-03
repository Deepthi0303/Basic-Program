package Company_pgm;

public class Same_dontCount {
	public static void main(String[] args) {
		int[] arr= {3,3,3};
		int[] freq=new int[100];
		for (int i = 0; i <arr.length; i++) {
			int num=arr[i];
			freq[num]++;
		}
		
		int sum=0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
