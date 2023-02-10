class OuterC {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(OuterC.this.value);
        }
    }
}


public class OuterInner {
    public static void main(String[] args) {

        OuterC o = new OuterC();
        OuterC.Inner i = o.new Inner();

        i.method1();
    }
}
