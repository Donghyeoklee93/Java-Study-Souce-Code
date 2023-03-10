public class MaxNumber {

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {

            // NullPointerException
            // if (arr.length == 0 || arr == null) {

            return -999999;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("Max number : " + max(data));
        System.out.println("Min number : " + max(null));
        System.out.println("Max number : " + max(new int[] {}));
    }
}
