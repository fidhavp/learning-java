public class sum_of_2 {
    byte a = 45;
    short b = 12345;
    int sum = a + b;
    byte c= (byte) sum;

    void display(){
        System.out.println("The sum is "+sum);
        System.out.println("The sum after converting into byte "+c);
    }
}
class main{
     static void main() {
       sum_of_2 obj=new sum_of_2();
       obj.display();
    }
}

