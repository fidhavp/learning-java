//in main class with enum

public class switchEnhancementDemo2 {
    static void main() {
        enum DAY {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
        DAY day=DAY.Monday;
        String result=switch (day){
            case Monday,Tuesday,Wednesday,Thursday,Friday-> "Weekday";

            case Saturday,Sunday-> "Weekend";

            default-> "invalid number";
        };
        System.out.println(result);
    }
}
