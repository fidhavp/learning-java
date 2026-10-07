import java.util.Scanner;

public class bodyMassIndex {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double height=sc.nextDouble();
        double meterHeight=height*0.01;
        System.out.println("Enter the weight : ");
        double weight=sc.nextDouble();
        double bmi=weight/(meterHeight*meterHeight);
        System.out.println("Body Mass Index = "+bmi);
    }
}
