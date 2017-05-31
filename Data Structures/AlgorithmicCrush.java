import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            long add = sc.nextLong();
            for(int j=t1-1; j<t2; j++)
                a[j] += add;
        }
        long max = a[0];
        for(int i=1; i<n; i++){
            if(a[i] > max)
                max = a[i];
        }
        System.out.println(max);
    }
}
