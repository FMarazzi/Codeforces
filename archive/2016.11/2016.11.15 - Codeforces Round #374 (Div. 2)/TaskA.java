package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        int tot=0, bl=0;
        int[] enc = new int[51];
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == 'W'){
                if (bl>0) enc[tot++] = bl;
                bl = 0;
            }
            else if (s.charAt(i) == 'B'){
                bl++;
            }
        }
        if (bl>0) enc[tot++] = bl;
        out.println(tot);
        for(int i = 0; i<tot;i++)
        out.print(enc[i]+" ");
    }
}
