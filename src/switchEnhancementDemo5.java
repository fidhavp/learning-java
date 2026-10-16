//with yield

public class switchEnhancementDemo5 {
    static String daysss(String days){
        return switch (days){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> "Weekday";
            case  "Saturday","Sunday" -> {
                System.out.print("the "+days+" is ");        //printing a value and providing a value are two different operations.
            yield "weekend";                                   //yield is used to provide a value to the switch expression.
            }

            default-> {
                System.out.print("the "+days+" is ");
                yield "invalid";
            }
        };
    }

    static void main() {
        String result=daysss("Suniday");
        System.out.println(result);

    }
}
