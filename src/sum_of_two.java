public class sum_of_two {
    int a=100;
    long b= 200L;
    long c=(long)a+b;
    int d=(int) c;

    void display(){
        System.out.println("The sum is "+c);
        System.out.println("The sum converted into int "+d);
    }
}
class bmain{
    static void main() {
        sum_of_two obj= new sum_of_two();
        obj.display();
    }
}