public class charDemo2 {
    char maxValue=Character.MAX_VALUE;
    char minValue=Character.MIN_VALUE;
    int a=(int)minValue;
    int b=(int)maxValue;


    void display(){
        System.out.println("Min value = "+minValue);
        System.out.println("Max value = "+maxValue);
        System.out.println(a);
        System.out.println(b);
    }

    static void main() {
        charDemo2 obj=new charDemo2();
        obj.display();
    }



}
