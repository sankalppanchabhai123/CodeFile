class Solution {
    // solving using BFS ie using queue
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        List<List<Integer>> neighbour=new ArrayList<>();
        int indeg[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            neighbour.add(new ArrayList<>());
        }
        for(int pre[]:prerequisites){
            neighbour.get(pre[1]).add(pre[0]);
            indeg[pre[0]]++;
        }
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
            if(i==indeg.length-1 && q.isEmpty()) return false;
        }

        while(!q.isEmpty()){
            int top=q.remove();
            res.add(top);
            for(int i: neighbour.get(top)){
                indeg[i]--;
                if(indeg[i]==0){
                    q.add(i);
                } 
            }
        }
         return res.size()==numCourses;
    }
}
