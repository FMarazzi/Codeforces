package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String word = in.next();
        int jump=0, max=0;
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            jump++;
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y'){
                if(jump > max) max = jump;
                jump = 0;
            }
        }
        jump++;
        if (jump > max) max = jump;
        out.print(max);
    }
}
