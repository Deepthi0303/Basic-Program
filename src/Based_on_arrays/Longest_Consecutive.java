package Based_on_arrays;

import java.util.HashSet;

public class Longest_Consecutive {
	public static void main(String[] args) {
		 String str = "abbcabsc";  //abcabcbb
	        int n = str.length();     // 0 1 2 3 4 5 6 7
	        int maxLength = 0;        // a b c a b c b b 
	        String longestSubstring = "";
	     
	        HashSet<Character> set = new HashSet<Character>();
	        int start = 0;        //0 1 2 3                                    -start

	        for (int end = 0; end < n; end++) {  //0 1 2 3 4 5 6 7                  -end 
	            while (set.contains(str.charAt(end))) {    
	                set.remove(str.charAt(start));    //remove- a b c b 7    imp- it will remove from indexes 0,1,2..
	                start++;                          // 1 2 3
	            }
	                                                      
	            set.add(str.charAt(end));  //    a  c  b
	        
	            int currentLength = set.size();  // 1 2 3 3 3 3 3 3
	            if (currentLength > maxLength) {   //1>0 2>1 3>2  3>3  3>3 3>3 3>3 3>3
	                maxLength = currentLength;    //maxlength=0 1 2 3 
	                longestSubstring = str.substring(start, end + 1);   // 0-1  0-2  0-3 
	            }
	        }
	        
	        System.out.println("Length of the longest substring: " + maxLength);
	        System.out.println("Longest substring without repeating characters: " + longestSubstring);

	}
}
