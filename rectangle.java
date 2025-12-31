public class rectangle {

    public static void hollo(int row, int colo){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=colo;j++){
                if(i==row || i==1 || j==1 ||j==colo){
                    System.out.print("* ");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        hollo(5,5);
    }
}