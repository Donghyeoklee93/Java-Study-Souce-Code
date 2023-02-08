class CardDeck {
    final int CARD_NUM = 20;
    CardInfo[] cards = new CardInfo[CARD_NUM];

    CardDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isJoker = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new CardInfo(num, isJoker);
        }
    }

    void shuffle() {

        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);

            CardInfo tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        }


        // int tmp;
        // boolean tmp1;

        // for (int i = 0; i < cards.length; i++) {
        //     int j = (int) (Math.random() * cards.length);

        //     tmp = cards[i].num;
        //     tmp1 = cards[i].isJoker;

        //     cards[i].num = cards[j].num;
        //     cards[i].isJoker = cards[j].isJoker;

        //     cards[j].num = tmp;
        //     cards[j].isJoker = tmp1;

        // }

    }

    public CardInfo pick(int index) {
        // Validate Index
        if(index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    public CardInfo pick() {
        return cards[(int) (Math.random() * cards.length)];
    }

}

class CardInfo {
    int num;
    boolean isJoker;

    CardInfo() {
        this(1, true);
    }

    CardInfo(int num, boolean isJoker) {
        this.num = num;
        this.isJoker = isJoker;
    }

    public String toString() {
        return num + (isJoker ? "K" : "");
    }

}

public class CardDetail {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
            // System.out.print (deck.cards[i].toString() + ",");
        }

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));

    }
}
