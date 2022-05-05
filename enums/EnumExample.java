package enums;

public class EnumExample {
    enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY("friday"),
        SATURDAY;

        private Days(){

        }
        private Days(String code){
            System.out.println("Constructor called for : "+ this.toString());
        }
    }
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        System.out.println(day);
        System.out.println(Days.values());
    }
}
