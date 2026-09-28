import java.util.Scanner;

public class inputOutput {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Byte Value : ");
        byte a=sc.nextByte();
        System.out.println("Entered a Byte Value is "+a);

        System.out.println("Enter a Short Value : ");
        short b=sc.nextShort();
        System.out.println("Entered a Short Value is "+b);


        System.out.println("Enter a Int Value");
        int c=sc.nextInt();
        System.out.println("Entered Integer Value is "+c);


        System.out.println("Enter a Char Value");
        char d=sc.next().charAt(0);
        System.out.println("Entered Char Value is "+d);


        System.out.println("Enter a long Value");
        long e=sc.nextLong();
        System.out.println("Entered Long Value is "+e);


        System.out.println("Enter a Float Value");
        float f=sc.nextFloat();
        System.out.println("Entered Float Value is "+f);


        System.out.println("Enter a Double Value");
        double g=sc.nextDouble();
        System.out.println("Entered Double Value is "+g);


        System.out.println("Enter a Boolean Value");
        boolean h=sc.hasNextInt();
        System.out.println("Entered Boolean Value is "+h);

    }
}


