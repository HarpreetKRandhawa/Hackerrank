import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int num = sc.nextInt();
            int limit = sc.nextInt();
            int max = -1;
            for(int j=1; j<=num; j++){
                for(int k=j+1; k<=num; k++){
                    if((j&k) > max && (j&k) < limit){
                        max = j&k;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
