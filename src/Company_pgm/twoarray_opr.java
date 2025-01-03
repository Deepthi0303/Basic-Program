package Company_pgm;

import java.util.Arrays;

public class twoarray_opr {
	public static void main(String[] args) {
		int[] arr1= {6,3,7,4,5};
		int[] arr2= {4,9,6,2,9,5,8};
		int length=0;
		length=Math.max(arr1.length,arr2.length);
		
		int carr1[]=new int[length];
		int carr2[]=new int[length];
		for (int i = 0; i < arr1.length; i++) {
			carr1[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			carr2[i]=arr2[i];
		}
		
		int[] res=new int[length];
		
		int index=0;
		
		for (int i = 0; i < length; i++) {
			if(carr1[i]%2==0 && carr2[i]%2==0) {
				res[index++]=carr1[i]+carr2[i];
			}else if(carr1[i]%2!=0 && carr2[i]%2!=0) {
				res[index++]=carr1[i]-carr2[i];
			}else {
				if(carr1[i]==0) {
					res[index++]=carr2[i];
				}else if(carr2[i]==0){
					res[index++]=carr1[i];
				}else {
					res[index++]=carr1[i]*carr2[i];
				}
				
			}
		}
		
		System.out.println(Arrays.toString(res));
	}
}
