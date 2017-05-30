import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
            //System.out.println(str[i]);
        }
        HashMap<String,Integer> map = new HashMap();
        for(int i=0; i<n; i++){
            if(map.containsKey(str[i])){
                int count = map.get(str[i]);
                map.put(str[i],count+1);
            }
            else{
                map.put(str[i],1);
            }
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            String s= sc.next();
            if(map.containsKey(s))
                System.out.println(map.get(s));
            else
                System.out.println(0);
        }
    }
}
