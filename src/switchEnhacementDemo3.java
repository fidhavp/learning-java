//return switch expression

public class switchEnhacementDemo3 {

    static String daysOfWeek(String day){
        return switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> "Weekday";

            case "Saturday","Sunday"-> "Weekend";

            default-> "invalid number";
        };
    }

    static void main() {
        String result=daysOfWeek("Monday");
        System.out.println(result);
    }
}
