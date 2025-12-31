package bitmani;

public class prime {
    public static void check(int num){
        int bitmask=1;
        if((num&bitmask)==1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }
    }
    // get i`th index bit
    public static int getIthBit(int num, int i) {
        int bitmask=1<<i;
        if((num&bitmask)==0) return 0;
        else return 1;
    }
    // set i`th index to 1
    public static int setIthBit(int num, int i){
        int bitmask=1<<i;
        // if((num&bitmask)==0){
        //     num=(num | bitmask);     
        // }
        // return num;
        return num | bitmask;
    }
    // set i`th index to 0
    public static int clearIthBit(int num, int i){
        // int bitmask=1<<i;
        // if((num&bitmask)!=0){
        //     num=(num ^ bitmask);     
        // }
        // return num;
        int bitmask=~(1<<i);
        return num & bitmask;
    }
    // clear last i bits
    public static int clearLastIbit(int num, int i){
        int Bitmask=-1<<i;
        return num & Bitmask;
    }
    public static int clearBitsinRange(int num, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask= a | b;
        return num & bitmask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    // to check
    public static int count1inBit(int num){
        int count=0;
        // while(num!=0){
        while(num>0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        return count; 
    }
    public static int fastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n & 1)!=0){
                ans=ans*a;
            }
            a= a*a;
            n=n>>1;
        }return ans;
    }
    public static void main(String args[]){
        // check(3);
        // System.out.print(getIthBit(10, 1));
        // System.out.print(setIthBit(10, 2));
        // System.out.print(clearIthBit(10, 1));
        // System.out.print(clearLastIbit(15, 2));
        // System.out.print(clearBitsinRange(10, 2,4));
        // System.out.println(isPowerOfTwo(4));
        // System.out.println(count1inBit(16));
        System.out.println(fastExpo(2,4));
    }
}