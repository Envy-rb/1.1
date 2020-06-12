package service;

import entity.Year;
import exception.GlobalException;
import validator.YearValidator;

public class LeapYearService
{
    public String calcResult(int yearNum, int monthNum) throws GlobalException {
        YearValidator validator = new YearValidator();
        if(!validator.validate(yearNum, monthNum))
        {
            throw new GlobalException("year interval exception(0<month<=12 & year>0)");
        }
        Year _year = new Year(yearNum, monthNum);
        StringBuilder out = new StringBuilder();
        out.append(_year.getLeap());
        out.append(" ");
        out.append(_year.daysInMonth());
        return out.toString();
    }

}
