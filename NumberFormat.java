import java.text.DecimalFormat;

public class NumberFormat {
    public static void main(String[] args){
        String data = "123,456,789.5";

        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,####");

        try {
            Number num = df.parse(data);

            double d = num.doubleValue();
            System.out.println("data:"+data);
            System.out.println("Rounding:"+Math.round(d));
            System.out.println("in units of ten thousand:"+df2.format(d));
        } catch (Exception e){}
    }
}