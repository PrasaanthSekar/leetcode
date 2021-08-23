package com.leetcode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        // write your code here
        String result = longestCommonPrefix1("wcqdyulxbzrabuvjjouvlmbzsfpcykmmusxdgrrirljrltlnswqqgyukxjfhzhbpipkswzqroarikxtrlzjriyivdjydlfopqnbqlwiperuaeszhthcunyqejayftrlwiucvlghkurgmnlixfoaokgvucdgzscjkwleifdkjycrgwidibldabhsquotljtvjxitfyrvvwlzxavvgjkmtxswxhutxgeaajuycqpxjraxgsixtmncwauubigsxdjzmgpdwvfztuzsxwyiwjeuzapjmbpfhcdzptmcphjtzdwdlpzzqnomamykbxmsbirtxjqfylatgzzelunzgomohgmlirxkgxregmbhwpoovormmvfrhqoovewpwukfdfxlmqdcvkvjueqrkmsgraexfhdstjaxqxwfbhbuvbnyxckefikkyblrfdrsdgyjckhblycffuqfsrlsenyluxepmscukwruipanugiakyrmmvrcjsgyprrke");
        System.out.println(result);
    }

    public static String longestCommonPrefix1(String s) {
        String longest = "" + s.charAt(0);
        while (s.length() > 1) {
            for (int i = s.length(); i > 1; i--) {
                if (isPalindrome(s.substring(0, i))) {
                    // check the previous longest here
                    if (s.substring(0, i).length() > longest.length()) {
                        longest = s.substring(0, i);
                    }
                }
            }
            s = s.substring(1);
            if (longest.length() > s.length()) {
                return longest;
            }
        }
        return longest;
    }

    private static boolean isPalindrome(String substring) {
        return substring.equals(new StringBuilder(substring).reverse().toString());
    }
}
