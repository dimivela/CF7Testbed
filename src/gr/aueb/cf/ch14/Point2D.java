package gr.aueb.cf.ch14;

public class Point2D extends Point {
    private double y;

    public Point2D () {
//        super();    // Ως 1η εντολη ΠΑΝΤΑ, το super() καλεί τον default constructor της Point.
                    // Το JVM το κανει by default αυτο.
                    // Το super ειναι δείκτης που δείχνει στο parent instance
//        y = 0;
    }

    public Point2D(double x, double y) {
        super(x); // Καλει τον overloaded constructor της Point
        //setX(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    //    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + y + ")"; //Υπερκαλυψη (override) ίδιο όνομα μεθόδου, διαφορετικό σώμα
//    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
