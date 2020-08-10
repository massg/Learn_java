import java.util.*;

class dfs{
  int V;
 LinkedList<Integer> adj[];
  @SuppressWarnings("unchecked")
  dfs(int v){
    V=v;
    adj = new LinkedList[v];
    for(int i=0;i<v;i++)
        adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v,int w){
    adj[v].add(w);
  }

  void DFS(int i,boolean visited[]){
    visited[i] = true;
    System.out.println(i);

    Iterator<Integer> j = adj[i].listIterator();
    while(j.hasNext()){
      int n = j.next();
      if(!visited[n]) DFS(n,visited);
    }
  }
  void dfs(){
    boolean visited[] = new boolean[V];
    for(int i=0;i<V;i++)
    if(visited[i] == false)
        DFS(i,visited);
  }
  public static void main(String[] args){
      dfs g = new dfs(4);

      g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dfs();
  }

}
