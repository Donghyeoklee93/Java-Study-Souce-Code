public class Cardcheck{
    public static void main (String []args){
        Card card1 = new Card(3, false);
        Card card2 = new Card();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class Card {
    int num;
    boolean isJoker;

    public Card(){
        this(1, true); // invoke Card(1, true) constructor
    }

    public Card(int num, boolean isJoker){
        this.num = num;
        this.isJoker = isJoker;
    }

    String info(){
        return num + (isJoker? "J" : ""); // return numeric into string. if it is joker, J is added.
    }
}