class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses==1) return new int[1];
        List<Integer> res=new ArrayList<>();
        int Indeg[]=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<prerequisites.length;i++){
            Indeg[prerequisites[i][0]]++;
        }
        for(int i=0;i<Indeg.length;i++){
            if(Indeg[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int top=q.remove(); 
            res.add(top);
            for(int i=0;i<prerequisites.length;i++){
                if(prerequisites[i][1]==top){
                    Indeg[prerequisites[i][0]]--;
                    if(Indeg[prerequisites[i][0]]==0){
                        q.add(prerequisites[i][0]);
                    }
                }
            }
        }
        if (res.size() != numCourses) return new int[0];
        int ans[]=new int[numCourses];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}
// Their is an optimal approach also present ie.
// class Solution {
//     public int[] findOrder(int numCourses, int[][] prerequisites) {
//         List<Integer> res = new ArrayList<>();
//         int[] indeg = new int[numCourses];
//         List<List<Integer>> adj = new ArrayList<>();
        
//         for (int i = 0; i < numCourses; i++) {
//             adj.add(new ArrayList<>());
//         }
        
//         for (int[] pre : prerequisites) {
//             adj.get(pre[1]).add(pre[0]);
//             indeg[pre[0]]++;
//         }
        
//         Queue<Integer> q = new LinkedList<>();
//         for (int i = 0; i < numCourses; i++) {
//             if (indeg[i] == 0) q.add(i);
//         }
        
//         while (!q.isEmpty()) {
//             int top = q.poll();
//             res.add(top);
//             for (int neighbor : adj.get(top)) {
//                 indeg[neighbor]--;
//                 if (indeg[neighbor] == 0) {
//                     q.add(neighbor);
//                 }
//             }
//         }
        
//         if (res.size() != numCourses) return new int[0];
        
//         int[] ans = new int[numCourses];
//         for (int i = 0; i < numCourses; i++) {
//             ans[i] = res.get(i);
//         }
//         return ans;
//     }
// }
