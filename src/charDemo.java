public class charDemo {
    char grade='A';
    char a='\u0047';

    char ch1='A';
    char ch2=65;
    char ch3='\u0041';


    char c1='#';
    char c2='\u0023';
    char c3=35;


    void display(){
        System.out.println(grade);
        System.out.println(a);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    static void main() {
        charDemo abc= new charDemo();
        abc.display();
    }
}
