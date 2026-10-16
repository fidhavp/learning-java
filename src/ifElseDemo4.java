import java.util.Scanner;

public class ifElseDemo4 {
    static void main() {
        System.out.println("Enter letter : ");
        Scanner sc=new Scanner(System.in);
        char letter=sc.next().charAt(0);

        if (letter=='a' || letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A' || letter=='E'||letter=='I'||letter=='O'||letter=='U'){
            System.out.println(letter+" is vowel");
        }else{
            System.out.println(letter+" is consonant");
        }
    }
}
