package Greedy_Algo;

import java.util.*;

public class JobSequenc {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d, int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs= new ArrayList<>();
        // Job jobs[]= new Job(jobInfo.length);
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        // Collections.sort(jobs,(obj1,obj2)-> obj1.profit-obj2.profit);
        //for accending order of profit
        Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit);
        //for decending order of profit
        ArrayList<Integer> seq= new ArrayList<>();
        // we done one mistack of "jobs.length" but it is an object
        // for(int i=0;i<jobs.length;i++){
        //     if(jobs[i]>)
        // }
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline> time){
                seq.add(curr.id);
                time++;
            }
        } 
        System.out.println("max jobs= "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
