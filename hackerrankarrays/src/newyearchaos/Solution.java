package newyearchaos;

/*
 * 
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	
    	int bribe = 0;
    	int flag = 0;
    	int p = q.length;
    	for(int i = 0; i<p;i++) {
    		
    		if(q[i]>=(i+1)) {
    			if(q[i]-(i+1)>2) {
    				flag = 1;
    				break;
    			}else {
    				bribe = bribe +(q[i]-(i+1));
    				flag =0;
    			}
    		}
    	}
    	if(flag == 0) {
    		System.out.println(bribe);
    	}else {
    		System.out.println("Too chaotic");
    	}
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
