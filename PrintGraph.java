public class PrintGraph {

    static void printG(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            for (int j = 0; j < dataArr[i]; j++) {
                System.out.print(ch);
            }
            System.out.println(dataArr[i]);
        }
    }


    public static void main(String[] args) {
        printG(new int[]{3, 4, 1, 4,}, '*');
    }
}
