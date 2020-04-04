//source: https://leetcode.com/problems/valid-palindrome/submissions/
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */


package com.app.algorithms.ValidPalindrome_125;

public class Solution {

    static String formatInput(String s) {
        return s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-z0-9]", "");
    }

    static boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        return formatInput(s).equals(new StringBuilder(formatInput(s)).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }


}
