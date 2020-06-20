// source: https://leetcode.com/problems/word-pattern/
/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
 */

package com.app.algorithms.WordPattern_290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
    }

    static class Solution {
        public boolean wordPattern(String pattern, String str) {

            String elements[] = str.split(" ");
            Map<Character, String> matchedElements = new HashMap<>();
            Set<String> setOfStrings = new HashSet<>();

            if (elements.length != pattern.length()) {
                return false;
            }

            for (int i = 0; i < pattern.length(); i++) {
                Character actual = pattern.charAt(i);
                String value = elements[i];

                if (matchedElements.containsKey(actual)) {
                    if (!matchedElements.get(actual).equals(value)) {
                        return false;
                    }
                } else {
                    matchedElements.put(actual, value);
                    setOfStrings.add(value);
                }
            }
            return setOfStrings.size() == matchedElements.size();
        }
    }
}
