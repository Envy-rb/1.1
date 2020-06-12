package entity;


public class Circle {
    private double r;
    public Circle(double r)
    {
        this.r = r;
    }

    public double calcSqr()
    {
        return Math.PI * Math.pow(r, 2);
    }

    public double calcPerimeter()
    {
        return Math.PI * 2 * r;
    }

    public Square calcInscribedSquare()
    {
        return new Square(r*2/Math.sqrt(2));
    }

    public Square calcAttachedSquare()
    {
        return new Square(r*2);
    }

}
