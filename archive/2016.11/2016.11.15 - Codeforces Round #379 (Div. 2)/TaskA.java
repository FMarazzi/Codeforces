package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n= in.nextInt();
        String s = in.next();
        int a=0,d=0;
        for(int i =0;i<n;i++){
            if (s.charAt(i) == 'A') a++;
            else if(s.charAt(i) == 'D') d++;
        }
        if (a>d)out.print("Anton");
        else if (a<d)out.print("Danik");
        else if (a==d)out.print("Friendship");
    }
}
