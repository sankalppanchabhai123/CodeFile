package OOPs;

public class supers {
    public static void main(String args[]){
        // Sub s=new Sub();
        // System.out.println(s.n);
        Animal a= new Animal();
        // System.out.println(Animal.num);
    }
}
class Animal{
    int num=9;
    Animal(){
        System.out.println("Animal");
    }
}
class Sub {
    Animal a=new Animal();
    int n=a.num;
    Sub(){
        a.num=12;
        // System.out.println();  
}
}
