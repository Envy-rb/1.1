package service;

import entity.year;
import exception.globalException;
import validator.yearValidator;

public class leapYearService
{
    year _year;
    public leapYearService(int yearNum, int monthNum) throws globalException {
        yearValidator validator = new yearValidator();
        if(!validator.validate(yearNum, monthNum))
        {
            throw new globalException("year interval exception(0<month<=12 & year>0)");
        }
        _year = new year(yearNum, monthNum);
    }
    public String result()
    {
        StringBuilder out = new StringBuilder();
        out.append(_year.getLeap());
        out.append(" ");
        out.append(_year.daysInMonth());
        return out.toString();
    }

}
