package Based_on_Numbers;
//0 1 1 2 3 5 8 ....
public class Fibbonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int num=7;
		int n3=0;
		System.out.print(n1+" "+n2+" ");
		for (int i = 1; i < num-1; i++) {
			n3=n1+n2;      
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
//		System.out.println(n3);
	}
}
