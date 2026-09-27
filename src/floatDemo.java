public class floatDemo {
    float a =98;
    float b= 98.8f;
    double c=989.9D;
    double d=1.6e62;
    double e=0.000000000000000000000000000000000000000000000000000000000000000034;
    float f=8.1234567866534765f;
    double g= 7.438533123d;
    double myHeight=5.34d;

    void dispaly(){
        double result;
        result=myHeight*0.3048;
        System.out.println("float = "+a);
        System.out.println("Any number having number after point is by default a double.\nSo need f at end.\nEg : "+b);
        System.out.println("double = "+c);
        System.out.println("double with e = "+d);
        System.out.println("This is also double = "+e);
        System.out.println("float with long number = "+f);
        System.out.println("double with long number = "+g);
        System.out.println("my height in meters = "+result);
    }

}
class cmain{
    static void main() {
        floatDemo obj=new floatDemo();
        obj.dispaly();
    }
}