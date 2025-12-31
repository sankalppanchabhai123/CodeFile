package Recursion;

public class printNumbers {
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        int f=fibonacci(n-1);
        int fN= fibonacci(n-2);
        int result=  fN+f;
        return result;
    }
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int f=sumOfN(n-1);
        int s=n+f;
        return s;
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int f=factorial(n-1);
        int s=n* f;
        return s;
    }
    public static void increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        // increasing(10);
        // System.out.print(factorial(5));
        // System.out.print(sumOfN(1));
        System.out.print(fibonacci(6));
    }
}
