public class Lesson1 {

    public static void main(String[] args) {

    }

    public static void createVariables(){
        byte byteVariable = 0;
        short shortVariable = 0;
        int intVariable = 0;
        long longVariable = 0;
        float floatVariable = 0;
        double doubleVariable = 0;
        char charVariable = 0;
        boolean booleanVariable = false;
    }

    public static double calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean inRange(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    public static void printIsPositiveOrNegative(int value) {
        if (value < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static boolean isNegative(int value) {
        return value < 0;
    }

    public static void printGreetings(String name){
        System.out.println("Привет, "+name+"!");
    }

}
