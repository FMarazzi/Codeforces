package myPackage;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        LinkedList<Integer>[] Vertex = new LinkedList[n];
        int tot=0;
        for(int i=0;i<n;i++) {
            Vertex[i] = new LinkedList<>();
            Vertex[i].add(in.nextInt());
        }

        for(int i=0;i<m;i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            if (!Vertex[a].getFirst().equals(Vertex[b].getFirst())){
                Vertex[a].addAll(Vertex[b]);
                Vertex[b].clear();
            }
        }
        for (int i =0;i<Vertex.length;i++){
            tot+=1;
        }
        out.print(tot);
    }
}
