package com.sam.hackerrank.leftrotation;

import java.io.*;
import java.util.*;

public class Solution {

    
    static int[] rotLeft(int[] a, int d) {
    	
    	int len = a.length;
    	int[] b = new int[len];
    	
    	System.arraycopy(a, d, b, 0, len-d);
    	
    	for(int x: b) {
    		System.out.print(x+" ");
    	}
    	System.out.println();
    	System.arraycopy(a, 0, b, len-d, d);
    	return b;
    	
    	
    }

     

    public static void main(String[] args) throws IOException {

    	Scanner scanner = new Scanner(System.in);
    	
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);
        
        for (int i = 0; i < result.length; i++) {
           
            	System.out.print(result[i]);
            	System.out.print(" ");       
        }
        scanner.close();
    }
}
