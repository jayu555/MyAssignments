package Day4.Assignment;

import java.util.Arrays;

public class Anagram {
	
	public static boolean areAnagrams(String s1, String s2)
    {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "“stops";
        String str2 = "potss";

        if (areAnagrams(str1, str2)) {
            System.out.println("The given strings are Anagram");
        }
        else {
            System.out.println("The given strings are not Anagram");
        }
	}

}
