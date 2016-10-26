package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

import static java.lang.Math.abs;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String word = in.next();
        // System.out.println(word);
        int tot = 0;
        int pos, old, diff;
        char c;
        int Letters = 26;
        old = (int)'a';
        for(int i = 0;i<word.length();i++) {
            c = word.charAt(i);
            pos = (int)c;
            diff = abs(old-pos);
            tot +=  diff <= 13 ? diff : 26-diff;
            old = pos;
        }
        out.print(tot);
    }
}
