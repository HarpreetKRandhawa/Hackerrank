import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ad = sc.nextInt();
        int am = sc.nextInt();
        int ay = sc.nextInt();
        int ed = sc.nextInt();
        int em = sc.nextInt();
        int ey = sc.nextInt();
        int fine = 0;
        if(ay == ey){
            if(am <= em){
                if(ad <= ed){
                    fine = 0;
                }
                else{
                    fine = 15 * (ad-ed);
                }
            }
            else{
                fine = 500 * (am - em);
            }
        }
        else if (ay > ey){
            fine = 10000;
        }
        System.out.println(fine);
    }
}
