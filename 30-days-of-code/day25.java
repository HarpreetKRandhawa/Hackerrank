import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int flag;
        for(int i=0; i <test_cases; i++){
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("Not prime");
                continue;
            }
            flag = 1;
            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}
