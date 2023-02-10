
class Out {
    static class Inner {
        int iv = 200;
    }
}

public class OuterClass {
    public static void main(String[] args) {
        Out.Inner i = new Out.Inner();

        System.out.println(i.iv);
    }
}
