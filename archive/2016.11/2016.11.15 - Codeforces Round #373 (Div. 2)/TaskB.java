package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n=in.nextInt();
        String s = in.next();
        char b,f;
        int rr = 0,bb=0;
        /*for (int i=0;i<s.length()-1;i++){
            b = s.charAt(i);
            f = s.charAt(i+1);
            if(b == f) {
            if (b == 'r') {
                    rr++;
                    if (i+2<s.length()) s = s.substring(0,i+1)+'b'+s.substring(i+2);
                } else {
                    bb++;
                    if (i+2<s.length()) s = s.substring(0,i+1)+'r'+s.substring(i+2);
                }
            }
        }*/
        for (int i=0;i<s.length();i++){
            if (i%2 == 0 && s.charAt(i) != 'r') rr++;
            else if (i%2 != 0 && s.charAt(i) != 'b') bb++;
        }
        int a = Math.max(bb,rr);
        bb = 0;
        rr = 0;
        for (int i=0;i<s.length();i++){
            if (i%2 == 0 && s.charAt(i) != 'b') rr++;
            else if (i%2 != 0 && s.charAt(i) != 'r') bb++;
        }
        out.print(Math.min(Math.max(bb,rr),a));
    }
}
