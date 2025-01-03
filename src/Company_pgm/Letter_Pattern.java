package Company_pgm;

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 

public class Letter_Pattern {
	public static void main(String[] args) {
		// Number of rows in the pattern
        int rows = 5;

        // Outer loop to handle the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print characters in each row
            for (int j = 1; j <= i; j++) {
                // Print character from 'A' onward
                System.out.print((char)('A' + j - 1) + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
	}
}
