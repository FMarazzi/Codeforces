package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int l = in.nextInt();
        String all = in.next();
        int outword=0,numwords=0,count=0;
        boolean parenth=false;
        for(int i=0;i<all.length();i++){
            char ch = all.charAt(i);
            if (ch == '_'){
                if (count>outword && !parenth) outword = count;
                if (count>0 && parenth) numwords++;
                count = 0;
            }
            else if (ch == '('){
                if (count > outword) outword = count;
                count = 0;
                parenth = true;
            }
            else if (ch == ')'){
                if (count>0) numwords++;
                count = 0;
                parenth = false;
            }
            else{count++;}
        }
        if (count > outword) outword = count;
        out.print(outword);
        out.print(" ");
        out.print(numwords);
    }
}
