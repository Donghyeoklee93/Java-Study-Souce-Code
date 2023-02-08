public class AbsoluteValue {
    public static int abs(int value) {
        // Using ternary conditional operator makes the code simple.
        return value >=0 ? value : -value;


        // if (value >= 0) {
        //     return value;

        // } else {
        //     return -value;
        // }


    }

    public static void main(String[] args){

        int value =5;
        System.out.println("Absolute value of " + value + " : " + abs(value));

        value = -10;
        System.out.println("Absolute value of " + value + " : " + abs(value));
    }
}
