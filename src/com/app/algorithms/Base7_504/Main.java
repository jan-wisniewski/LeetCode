/*
//source: https://leetcode.com/problems/base-7/

Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"

Example 2:
Input: -7
Output: "-10"

Note: The input will be in range of [-1e7, 1e7].

 */

package com.app.algorithms.Base7_504;

public class Main {

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isPositive = true;
        if (num < 0) {
            isPositive = false;
            num = num * (-1);
        }
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(num % 7);
            num = num / 7;
        }
        return isPositive ? result.reverse().toString() : result.append("-").reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }
}