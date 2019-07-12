package com.sam.hackerrank.aray2d;

/*
 * Given a 6*6 2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in the given array to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are 16 hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.


 */



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	
    	Integer max = Integer.MIN_VALUE;
    	int sum = 0;
    	
    	for(int i = 0;i<=3;i++) {
    		for(int j=0;j<=3;j++) {
    			
    			sum = arr[i+1][j+1];
    			
    			for(int k = j;k<j+3;k++) {
    				sum = sum + arr[i][k]+arr[i+2][k];
    			}
    			if(sum>max) {
    				max = sum;
    			}
    		}
    	}
    	
    	return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
