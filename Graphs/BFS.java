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
    public void DFS(ArrayList<Edge>[] graph){
      Queue<Integer> q=new LinkedList<>();
      boolean visited[]=new boolean[graph.length];
      q.add(0);
      while(!q.isEmpty()){
        int curr=q.remove();
        if(!visited[curr]){
          visited[curr]=true;
          System.out.println(curr);
          for(int i=0;i<curr.size();i++){
            Edge e= graph[curr].get(i);
            q.add(e.dest);
          }
        }
      }
    }
}
