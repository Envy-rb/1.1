package service;

import entity.circle;
import exception.globalException;
import validator.shapeValidator;

public class circleStatsService {
    private double r;
    private circle circ;

    public circleStatsService(double r) throws globalException {
        shapeValidator validator = new shapeValidator();
        if (!validator.validate(r))
        {
            throw new globalException("r must be > 0");
        }
        else {
            this.r = r;
            circ = new circle(r);
        }
    }

    private double roundToTwoDigits(double d)
    {
        return d = Math.round(d*100)/100.0d;
    }

    public double[] getResult()
    {
        double[] res = {roundToTwoDigits(circ.calcPerimeter()), roundToTwoDigits(circ.calcSqr())};
        return res;
    }

}
