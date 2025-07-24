package Arrays.Day8;
/*Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.



        Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
        Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.*/


import java.util.Arrays;

public class SortCharactersByFrequency {

    public static void main(String args[])
    {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
       char[] ch = s.toCharArray();
       int[] freq = new int[128];
       
       for(int i=0; i<ch.length; i++)
       {
           freq[ch[i]]++;
       }
       
       Character chars[] = new Character[128];
       for(int i=0; i<chars.length; i++)
       {
           char c = (char)i;
           chars[i] = c;
       }



        Arrays.sort(chars , (a,b)->freq[b]-freq[a]);
        System.out.println(Arrays.toString(chars));
       String result = "";
       for(Character c : chars)
       {
           if(freq[c]!=0)
           {
               while(freq[c]!=0)
               {
                   result =result + c;
                   freq[c]--;
               }
           }
       }
       return result;
    }
}
