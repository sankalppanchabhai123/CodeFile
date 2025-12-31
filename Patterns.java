public class Patterns {
    public static void halfpyra_num(int row){
        for(int i=1;i<=row;i++){
                for(int l=1;l<=row-i+1;l++){
                    System.out.print(l);
                }
                System.out.println();
            }
    }
    public static void floyd_tri(int row){
        int counter=1;
        for(int i=1;i<=row;i++){
                for(int l=1;l<=i;l++){
                    System.out.print(counter+" ");
                    counter++;
                }
                System.out.println();
            }
    }
    public  static void floyd_tri_01(int row){
        for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*(row-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=row;i>1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*(row-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void solid_rhombus(int row){
        for(int i=1;i<=row;i++){
                for(int j=1;j<=(row-i); j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void hollow_rhombus(int row){
        for(int i=1;i<=row;i++){
                for(int j=1;j<=(row-i); j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=row;j++){
                    if(i==1 || i==row ||j==1 || j==row){
                        System.out.print("*"); 
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
    public static void diamond(int row){
        for(int i=1;i<=row;i++){
                for(int j=(row-i);j>=1; j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i; j++){
                    System.out.print("*");
                }
                for(int j=2;j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=row;i>=1;i--){
                for(int j=(row-i);j>=1; j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i; j++){
                    System.out.print("*");
                }
                for(int j=2;j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void main(String [] args){
        // halfpyra_num(5);
        // floyd_tri(15);
        // floyd_tri_01(5);
        // solid_rhombus(4);
        // hollow_rhombus(5);
        diamond(5);
    }
}
