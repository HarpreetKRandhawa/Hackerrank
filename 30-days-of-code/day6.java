import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        String odd_string = "";
        String even_string = "";
        for(int i = 1; i<= tc; i++){
            String input = sc.nextLine();
            for(int j = 0; j < input.length(); j++){
                if(j%2 == 1){
                    odd_string += input.charAt(j);
                }
                else{
                    even_string += input.charAt(j);
                }
            }
            System.out.println(even_string+" "+odd_string);
            odd_string = "";
            even_string = "";
        }
    }
}
