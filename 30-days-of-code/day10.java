import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int max_count = 0;
        String binary = Integer.toBinaryString(num);
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count += 1;
                max_count = Math.max(max_count,count);
            }
            else{
                count = 0;
            }
        }
        System.out.println(max_count);
        
    }
}
