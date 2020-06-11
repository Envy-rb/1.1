package entity;

public class square {
    private double sqr, side;

    public square(double side)
    {
        this.side = side;
        sqr = Math.pow(side, 2);
    }

    public double calcSqr()
    {
        return sqr;
    }

    public circle calcInscribedCircle()
    {
        return new circle(side / 2);
    }

    public circle calcAttachedCircle()
    {
        return new circle(side * Math.sqrt(2) / 2);
    }
}
