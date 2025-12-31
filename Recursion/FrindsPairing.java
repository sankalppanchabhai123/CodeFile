package Recursion;

public class FrindsPairing {
    public static int frindspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // choice
        // single
        int fnm1=frindspairing(n-1);
        
        // pair
        int fnm2=frindspairing(n-2);
        int pairWays=(n-1)*fnm2;

        // totalWays
        int totWays=fnm1+pairWays;
        return totWays;
        // return frindspairing(n-1)+ (n-1)*frindspairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(frindspairing(3));
    }
}
