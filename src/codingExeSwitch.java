//converting traditional switch to use arrow labels

import java.time.DayOfWeek;

public class codingExeSwitch {

    static String getDataType(DayOfWeek day){
        return switch (day){
            case SATURDAY ,SUNDAY-> "weekend";
            default -> "weekday";
        };
    }
    static void main() {
        String result=getDataType(DayOfWeek.MONDAY);
        System.out.println(result);
    }
}
