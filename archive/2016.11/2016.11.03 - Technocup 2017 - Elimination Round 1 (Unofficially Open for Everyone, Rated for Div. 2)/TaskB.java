package myPackage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String text = in.next();
        double val=0, tot=0;
        int dec=0;
        int a;
        char ch;
        for(int i=text.length()-1;i>=0;i--){
            ch = text.charAt(i);
            a = Character.getNumericValue(ch);
            if(a>=0 && a <= 9) {
                val += a*(Math.pow(10,dec));
                dec++;
            }
            else if(ch == '.'){
                if (dec==2) {
                    val /= 100;
                    dec = 0;
                }
            }
            else {
                dec=0;
                tot+=val;
                val = 0;
            }
        }
        double dc = tot - (long)tot;
        out.print(NumberFormat.getNumberInstance(Locale.GERMAN).format((int)tot));
        if(dc > 0) {
            for(int i=1;i<4;i++)
            out.print(Float.toString((float)dc).charAt(i));
        }

       /*
        int n=0;
        int temp;
        boolean integ = tot == Math.floor(tot);
        while (tot>1000) {
            temp = (int)Math.floor(tot);
            while (temp > 1000) {
                temp /= 1000;
                n++;
            }
                out.print((int)Math.floor(temp));
                out.print('.');
                tot -= temp * (int)Math.pow(1000,n);
                n--;
        }
        while (n>0) {
            out.print("000");
            out.print('.');
            n--;
        }
        if (integ) out.print((int)tot);
        else out.printf("%.2f", tot);*/
    }
}