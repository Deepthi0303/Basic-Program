	package Based_on_arrays;
	
	import java.util.Arrays;
	
	public class First_Consecutive_Sequence {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4,12,44,876,11,50,32,5 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] ans=new int[arr.length];
		ans[0]=arr[0];                                      // ans[1]=2 first elem of sorted arr
		for (int i = 1; i < arr.length; i++) {              // 1 to arr.length in sorted arr
			if(arr[i-1]+1==arr[i]) {
				ans[i]=arr[i];
			}
		}
		int count=0;
		for (int i = 0; i < ans.length; i++) {
			if(ans[i]!=0) {
				count++;
			}
			else {
				break;
			}
		}
		ans=Arrays.copyOf(ans, count);
		System.out.println(Arrays.toString(ans));
		System.out.println("Length is "+ans.length);
	}
	}
