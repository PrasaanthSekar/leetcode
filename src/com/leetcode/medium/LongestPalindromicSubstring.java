package com.leetcode.medium;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        // write your code here
        String result = longestCommonPrefix2("bkuadixhrtfehvbjjzojfyhuqyckdeilnftnklylyssbjivhvnplrzwrgcnrciypvacbhdnglflipnlpzgivjfieunhzeaytshrintdwhbvbkhbsqbjxwhqrlneiwkmccdnfcvapmtqihzyyoiaoqgtxkpbqqdboaxmmsdjxvdrwbhdnemqmsikoksfvjjovrbgdtfgmhgryvvpunzrsluqzibsvyubyhqevpnfnszzriljpmoevpqacbvdcsgfzmnkhnshsvynxxncqyjxqazcttkvjnkuvykgdrquybvlpwzladpetocuphzkgfuutqcbnttwjmkkwbmbidcyauopcxmsarodcqabirbawtlgsytlflsiolxjghjmqrymadpzaetcchyvkaezeavjemubbquclhcjcmbwxphllhfnzfyewpyyiirgnohylfbtfddeohtifrqiiwpdtyqjyemqjlnpcwlsylxjuxtnmcrpdznbzschmnjxnldxpkbrikpfsfwhsarrfjueubvnztlwmognapvxwelyvueheqxtncpxhzwplaxqqrbmfmmqhohucxinxidxzhndvstideuwrisjgpwkgvsdxmlnfgqzzksflmjzckkyutrwptfvcawfbvqxlztstpoitdepexxiqtsdtjmssqbdinalsqkjjqkgilbfxajninuclquszwbmstcdbywfhhnierqsegafyfqzvmqockcowfqwbgfxvdxbqobditvowhtdeptljetgj");
        System.out.println(result);
    }

    //O(n^2)
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

    public static String longestCommonPrefix2(String s) {
        int length = s.length();
        while (s.length() > 1) {
            for (int i = 0; i + length <= s.length() && i < s.length(); i++) {
//                if (i + length <= s.length()) {
                String newString = s.substring(i, i + length);
                if (isPalindrome(newString)) {
                    return newString;
                }
//                }
            }
            length--;
        }
        return "" + s.charAt(0);
    }

    private static boolean isPalindrome(String substring) {
        return substring.equals(new StringBuilder(substring).reverse().toString());
    }
}
