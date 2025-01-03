package Based_on_Numbers;

public class Prime {
public static void main(String[] args) {
	int a=19;
	boolean flag=true;
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			flag=false;
		}
	}
	if(flag) {
		System.out.println("Yes Prime");
	}else {
		System.out.println("Not prime");
	}
}
}
