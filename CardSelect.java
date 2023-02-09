// if i want to not to allow to change card's number and type while the game is processing,
// we can do that by using final in front of variables.


class CardDetail {
    final int NUM;
    final boolean IS_ADVENTAGE;

    CardDetail() {
        this(1, true);
    }

    CardDetail(int num, boolean isAdventage) {
        this.NUM = num;
        this.IS_ADVENTAGE = isAdventage;
    }

    public String toString() {
        return NUM + (IS_ADVENTAGE ? "K" : "");
    }
}

public class CardSelect {
    public static void main(String[] args) {
        CardDetail card = new CardDetail (1, true);
    }

}
