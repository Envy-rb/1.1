package service;

import entity.Circle;
import exception.GlobalException;
import validator.ShapeValidator;

public class CircleStatsService {

    private double roundToTwoDigits(double d)
    {
        return d = Math.round(d*100)/100.0d;
    }

    public double[] getResult(double r) throws GlobalException {
        Circle circ;
        ShapeValidator validator = new ShapeValidator();
        if (!validator.validate(r))
        {
            throw new GlobalException("r must be > 0");
        }
        else {
            circ = new Circle(r);
        }
        double[] res = {roundToTwoDigits(circ.calcPerimeter()), roundToTwoDigits(circ.calcSqr())};
        return res;
    }

}
