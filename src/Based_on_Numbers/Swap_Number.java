package Based_on_Numbers;

public class Swap_Number {
public static void main(String[] args) {
	int a=10;
	int b=20;
//	way-1
//	int temp=a;
//	a=b;
//	b=temp;
	
//	way-2
	a=a+b;    //a=30
	b=a-b;    //b=10;
	a=a-b;    //a=20
	System.out.println(a);
	System.out.println(b);
}
}
