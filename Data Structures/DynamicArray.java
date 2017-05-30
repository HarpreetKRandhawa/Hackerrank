import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        List<Integer>[] seqList = new List[N];
        for(int i=0; i<N; i++){
            seqList[i] = new ArrayList<>();
        }
        int lastAnswer = 0;
        for(int i=0; i<Q; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> seq = seqList[(x^lastAnswer)%N];
            if(t == 1){
                seq.add(y);
            }
            else if(t == 2){
                lastAnswer = seq.get(y%seq.size());
                System.out.println(lastAnswer);
            }
            
        }
    }
}
