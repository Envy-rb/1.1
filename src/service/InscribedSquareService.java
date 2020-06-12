package service;

import entity.Circle;
import entity.Square;
import exception.GlobalException;
import validator.ShapeValidator;

public class InscribedSquareService {

    public double calcResult(Double squareSqr) throws GlobalException {
        Square mainSquare, inscribedSquare;
        Circle inscribedCircle;
        ShapeValidator validator = new ShapeValidator();
        if(!validator.validate(squareSqr))
        {
            throw new GlobalException("side length exception(side>0)");
        }
        mainSquare = new Square(Math.sqrt(squareSqr));
        inscribedCircle = mainSquare.calcInscribedCircle();
        inscribedSquare = inscribedCircle.calcInscribedSquare();
        return Math.round(mainSquare.calcSqr() / inscribedSquare.calcSqr());
    }
}
