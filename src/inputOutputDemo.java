import java.io.IOException;
import java.util.Scanner;

public class inputOutputDemo {
    static void main() throws IOException {
//        System.out.println("hello!");
//        int x=System.in.read();   //it gives the ascii values as output
//        System.out.println(x);


        Scanner sc=new Scanner(System.in);
//        System.out.println("Your name: ");


//        String a=sc.next();   // it can have first word only
//        System.out.println("your first name is : "+a);
//        String b=sc. next();
//        System.out.println("your second name is : "+b);


//        String c=sc.nextLine();  //it can read any
//        System.out.println(c);


//        System.out.println("first num");
//        int num1=sc.nextInt();                //to read integers
//        System.out.println("Second num");
//        int num2=sc.nextInt();
//        int sum=num1+num2;
//        System.out.println(sum);


//        System.out.println("first num");
//        byte num01=sc.nextByte();
//        System.out.println("Second num");
//        byte num02=sc.nextByte();
//        byte sum=(byte)(num01+num02);
//        System.out.println(sum);


        //in case of boolean
        System.out.println("enter : ");
//        boolean num001=sc.hasNextInt();
//        System.out.println(num001);

        boolean num002=sc.hasNextLong();
        System.out.println(num002);





    }
}
