package Based_on_Numbers;

public class Num_Palindrom {
public static void main(String[] args) {
	int num=121;
	int rem=0;
	int rev=0;
	int copy=num;
	while(num!=0) {
		rem=num%10;         
		rev=rev*10+rem;     
		num/=10;
	}
	System.out.println(rev);
	if(copy==rev) {
		System.out.println("Yes Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
}
}
