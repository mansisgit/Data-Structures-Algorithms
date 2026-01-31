package Startups;

import java.util.HashSet;
import java.util.Set;

public class Ques3 {
    public static void main(String[] args) {
        Set<Edge> uniqueEdges = new HashSet<>();
        uniqueEdges.add(new Edge(1,2));
        uniqueEdges.add(new Edge(7,2));
        uniqueEdges.add(new Edge(9,2));


    }
}
class Edge{
    int u,v;
    public Edge(int a,int b){

    }
    public boolean equals(Object o){
        if(this==o){
            return false;
        }
        if(!(o instanceof Edge))
            return false;
        Edge edge = (Edge) o;
        return  u== edge.u && v==edge.v;
     }

     public int hashCode(){
        return Object.hash(u,v);
     }


}

