public class booleanDemo {
    boolean hello=true;
    int a=10,b=15;
    boolean  result= (a<b);

    void display(){

        boolean hayy=true;
        System.out.println("Java is easy "+hello);
        System.out.println("is programming fun "+hayy);
        System.out.println("is a less than b "+result);
    }
}
 class main3{
     static void main() {
         booleanDemo abc=new booleanDemo();
         abc.display();
     }
 }