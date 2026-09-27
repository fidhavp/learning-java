import java.time.Duration;

public class escapeSequence {
    static void main() throws InterruptedException{
        System.out.println("hello\nJenny");
        System.out.println("hello\tJenny");
        System.out.println("The sun was \"bright\", and the sky was \"clear\".");
        System.out.println("Birds were \'flying\' in the blue sky.");
        System.out.println("C:\\bca\\java - Jenny lectures\\assignment");
        System.out.println("Birds were flying\r in the blue sky.");
        System.out.println("mor\bning air.");

        //another eg for \b :
        for(int i=1;i<=10;i++){
            System.out.print(i * 10 + "%");
            Thread.sleep(300);
            System.out.print("\b\b\b\b");
        }
        System.out.println("Done!");

//        another eg :

        for(int i=5;i>=1;i--){
            System.out.print(i);
            Thread.sleep(500);
            System.out.print("\b");
        }
        System.out.print("Happy New Year");

    }
}
