package service;

import entity.circle;
import entity.square;
import exception.globalException;
import validator.shapeValidator;

public class inscribedSquareService {
    square mainSquare, inscribedSquare;
    circle inscribedCircle;
    public inscribedSquareService(Double squareSqr) throws globalException {
        shapeValidator validator = new shapeValidator();
        if(!validator.validate(squareSqr))
        {
            throw new globalException("side length exception(side>0)");
        }
        mainSquare = new square(Math.sqrt(squareSqr));
        inscribedCircle = mainSquare.calcInscribedCircle();
        inscribedSquare = inscribedCircle.calcInscribedSquare();
    }
    public double result()
    {
        return Math.round(mainSquare.calcSqr() / inscribedSquare.calcSqr());
    }
}
