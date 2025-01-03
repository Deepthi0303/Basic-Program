package Based_on_Numbers;

public class nth_prime {
public static void main(String[] args) {
	int n=5;
	int count=0;
	int num=3;
	while(count!=n) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(num);
			count++;
			if(count==n) {
				System.out.println(num);
			}
		}
		num++;
	}
}
}
