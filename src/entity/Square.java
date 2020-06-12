package entity;

public class Square {
    private double sqr, side;

    public Square(double side)
    {
        this.side = side;
        sqr = Math.pow(side, 2);
    }

    public double calcSqr()
    {
        return sqr;
    }

    public Circle calcInscribedCircle()
    {
        return new Circle(side / 2);
    }

    public Circle calcAttachedCircle()
    {
        return new Circle(side * Math.sqrt(2) / 2);
    }
}
