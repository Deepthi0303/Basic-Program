package Based_on_Numbers;

public class Number_of_digits {
public static void main(String[] args) {
	int num=123456;
	int count=0;
	while(num!=0) {
		count++;
		num/=10;
	}
	System.out.println(count);
}
}
