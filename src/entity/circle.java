package entity;


public class circle {
    private double r;
    public circle(double r)
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

    public square calcInscribedSquare()
    {
        return new square(r*2/Math.sqrt(2));
    }

    public square calcAttachedSquare()
    {
        return new square(r*2);
    }

}
