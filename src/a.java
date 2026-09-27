public class a {
    static int x;
    final int count=100;
    int age = 22;
    byte f=(byte) age;
    int next_age=age+2;
    int minValue=Integer.MIN_VALUE;
    int maxValue =Integer.MAX_VALUE;
    int b=maxValue+1;
    int c=maxValue-1;
    int d=minValue+1;
    int e=minValue-1;
    int octNum=0123432;
    int hexaNum=0x12c;
    int binary=0b1010;

    void method() {
        int age1=19;
        age1 = 30;
        age1=(5*3)*(10-5);
        System.out.println("The age  is "+age1);
        System.out.println("Next person age is "+next_age);
        System.out.println("Actual age= "+age);
        System.out.println("count = "+count);
        System.out.println("Minimum value of int = "+minValue);
        System.out.println("Maximum value of int = "+maxValue);
        System.out.println("B  = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("E = "+e);
        System.out.println("Octal Number = "+octNum);
        System.out.println("Hexa Number = "+hexaNum);
        System.out.println("Binary Number = "+binary);
        System.out.println("Int to Byte = "+f);

    }
}
class amain{
    static void main() {
        a obj=new a();
        System.out.println(obj.x);
        System.out.println(obj.age);
        System.out.println(obj.count);
        obj.method();
    }
}







