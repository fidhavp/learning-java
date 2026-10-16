import java.util.Scanner;

public class coffeeOrderingSystemProject {
    static void main() {
        float rate =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("\u263A WELCOME TO COFFEE CAFE \u2615");
        System.out.println("****************************");
        System.out.println("Choose your coffee : ");
        System.out.println("1.Expresso - \u20B9200");
        System.out.println("2.Cappucino - \u20B9250");
        System.out.println("3.Latte - \u20B9300");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            rate = 200;
        } else if (choice == 2) {
            rate = 250;
        } else if (choice == 3) {
            rate = 300;
        }else{
            System.out.println("invalid coffee choice");
        }
        if(choice>0 && choice<4){
        System.out.println("Add whipped creams for $30? ( Yes=1 / No=0 )");
        int whipped=sc.nextInt();
        if(whipped==1){
            rate=rate+30;
        }else if(whipped==0){
            rate=rate+0;
        }else{
            System.out.println("invalid add on choice");
        }
        System.out.println("Add a flavour shot? (vanilla for $20 Hazelnet for $25) (yes=1 / no=0) ");
        int shot=sc.nextInt();
        if(shot==1){
            System.out.println("Which flavour ? Enter 1 for vanilla ($20) or 2 for hazelnut ($25)  ");
            int flavour=sc.nextInt();
            if(flavour==1){
                rate=rate+20;
            }else if(flavour==2) {
                rate = rate + 25;
            }else{
                System.out.println("invalid flavour choice");
            }
        }else if(shot==0){
            rate=rate+0;
        }else{
            System.out.println("Invalid choice");
        }
        System.out.println("Total bill : \u20B9"+rate);
        }

    }
}
