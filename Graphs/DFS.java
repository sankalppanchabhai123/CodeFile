public class Main{
  public static Edge{
    int src;
    int dest;
    int weight;
    public Edge(int s,int d,int w){
      this.src=s;
      this.dest=d;
      this.weight=w;
    }
  }
    public void DFS(ArrayList<Edge>[] graph, int curr,boolean vis[]){
      SOUT(curr);
      vis[curr]=true;
      for(int i=0;i<graph[curr].size();i++){
          Edge e= graph[curr].get(i);
          if(!vis[e.dest]){
            DFS(graph,e.dest,vis);
          }
        }
}
}
