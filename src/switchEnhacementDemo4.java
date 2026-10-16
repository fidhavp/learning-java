//return switch exp with enum

public class switchEnhacementDemo4 {
    static String daysOfWeek() {
        enum days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

//        System.out.println("enter a day");
//        Scanner sc=new Scanner(System.in);             //when we ask to the user
//        days Day = days.valueOf(sc.nextLine());



        days Day = days.Monday;

        return switch (Day) {
            case  Monday, Tuesday, Wednesday, Thursday, Friday-> "Weekday";
            case  Saturday, Sunday-> "Weekend";
            default -> "invalid number";
        };
    }

    static void main() {
        String result=daysOfWeek();
        System.out.println(result);
    }
}
