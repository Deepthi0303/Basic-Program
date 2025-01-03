package Based_on_Numbers;

public class Power_of_2 {
public static void main(String[] args) {
	int num=16;
	boolean flag=true;
	for(int i=0;i<num;i++) {
		int a=(int) Math.pow(2, i);
		if(a==16) {
			flag=false;
			System.out.println("Yes its a power");
			break;
		}
	}
	if(flag) {
		System.out.println("No its not power");
	}
	}
}
