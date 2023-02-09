abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this(new Point(0, 0), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        return width * height;
    };

    boolean isSquare() {
        return width * height != 0 && width == height;
    };
}