/*
//source: https://leetcode.com/problems/pascals-triangle/

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

 */

package com.app.algorithms.PascalTraingle_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }

    static class Solution {

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> rows = new ArrayList<>();
            if (numRows == 0) {
                return rows;
            }

            rows.add(Arrays.asList(1));

            for (int i = 1; i <= numRows - 1; i++) {

                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);

                for (int j = 1; j < rows.get(i - 1).size(); j++) {
                    int value = rows.get(i - 1).get(j - 1) + rows.get(i - 1).get(j);
                    currentRow.add(value);
                }

                currentRow.add(1);
                rows.add(currentRow);

            }
            return rows;
        }
    }
}