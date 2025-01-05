package Practice;

import java.util.Scanner;

public class Continous_Subarry_String {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter the string: ");
	        String input = sc.nextLine();

	        // Find the longest consecutive sequence in the string
	        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(input));
	        
	        sc.close();
	    }

	    // Method to find longest consecutive sequence in a string
	    public static String longestConsecutive(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }

	        int maxLength = 1;  // To keep track of the maximum length
	        int currentLength = 1;  // Current length of the consecutive sequence
	        int start = 0;  // Start index of the longest sequence
	        int tempStart = 0;  // Temporary start index for the current sequence

	        // Iterate through the string
	        for (int i = 1; i < s.length(); i++) {
	            // Check if the current character is consecutive to the previous one
	            if (s.charAt(i) == s.charAt(i - 1) + 1) {
	                currentLength++;
	            } else {
	                // Reset the current length
	                currentLength = 1;
	                tempStart = i;
	            }

	            // Update the max length and the start index if we found a longer sequence
	            if (currentLength > maxLength) {
	                maxLength = currentLength;
	                start = tempStart;
	            }
	        }

	        // Return the longest consecutive sequence
	        return s.substring(start, start + maxLength);
	    }
	}
