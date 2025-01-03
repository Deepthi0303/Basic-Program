package Company_pgm;

public class Switching_cases {
	public static void main(String[] args) {
		String a="trUnf6y89be";
		String org=a.replaceAll("[0-9]", "0");
		System.out.println(a);
		
		for (int i = 0; i < org.length(); i++) {
			char ch=org.charAt(i);
			if(ch=='A' ||ch=='a'||ch=='E' ||ch=='e'||ch=='I' ||ch=='i'||ch=='O' ||ch=='o'||ch=='U' ||ch=='o') {
				System.out.print(Character.toUpperCase(ch));
			}else if(ch!='A' && ch!='a' && ch!='E' &&ch!='e'&&ch!='I' &&ch!='i'&&ch!='O' &&ch!='o' &&ch!='U' &&ch!='u'){
				System.out.print(Character.toLowerCase(ch));
			}
		}
	}
}
