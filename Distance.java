class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        // expression related to square root can be calculated Math.sqrt method.
        return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
    }
}

public class Distance {
    public static void main(String[] args) {
        Position P = new Position(1, 1);

        // Calculating the distance between P and (2,2)
        System.out.println(P.getDistance(2, 2));
    }
}
