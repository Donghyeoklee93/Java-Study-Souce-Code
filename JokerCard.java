public class JokerCard {
    public static void main(String[] args) {
        CardInfomation c1 = new CardInfomation(3,true);
        CardInfomation c2 = new CardInfomation(3,true);

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c1.equals(c2)="+c1.equals(c2));
    }
}

class CardInfomation {
    int num;
    boolean isJoker;

    CardInfomation (){
        this(1, true);
    }

    CardInfomation(int num, boolean isJoker) {
        this.num = num;
        this.isJoker = isJoker;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CardInfomation) {
            CardInfomation c = (CardInfomation) obj;
            return num == c.num && isJoker == c.isJoker;
        }
        return false;
    }

    public String toString() {
        return num + (isJoker ? "J" : "");
    }
}
