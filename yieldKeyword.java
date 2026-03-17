/* 
public class Switch {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
}
*/
//ALTERNATE VERSION
/* 
public class Switch {
   public static void main(String[] args) {
       int day = 3;
       String dayName;

       switch (day) {
           case 1 -> dayName = "Monday";
           case 2 -> dayName = "Tuesday";
           case 3 -> dayName = "Wednesday";
           case 4 -> dayName = "Thursday";
           case 5 -> dayName = "Friday";
           case 6 -> dayName = "Saturday";
           case 7 -> dayName = "Sunday";
           default -> dayName = "Invalid day";
       }

       System.out.println("The day is: " + dayName);
   }
}
*/

//YIELD KEYWORD
public class yieldKeyword{
    public static void main(String[] args){
        int day=3;
        String dayName = switch (day) {
            case 1:
                yield "Monday";
            case 2:
                yield "Tuesday";
            case 3:
                yield "Wednesday";
            case 4:     
                yield "Thursday";
            case 5:
                yield "Friday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield "Invalid day";
        };
        System.out.println("The day is: " + dayName);
    }
}
