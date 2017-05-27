import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> l = new ArrayList<String>();
        String myRegex = "[a-z]@gmail.com";
        Pattern p = Pattern.compile(myRegex);
        for(int i=0; i<t; i++){
            String name = sc.next();
            String email = sc.next();
            Matcher m = p.matcher(email);
            if(m.find()){
                l.add(name);
            }
        }
        Collections.sort(l);
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
}
