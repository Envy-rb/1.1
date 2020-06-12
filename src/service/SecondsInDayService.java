package service;

import exception.GlobalException;
import validator.SecondsInDayValidator;

public class SecondsInDayService {


    private int calcHours(int seconds)
    {
        return seconds/3600;
    }
    private int calcMinutes(int seconds)
    {
        return (seconds/60)%60;
    }
    private int calcSeconds(int seconds)
    {
        return seconds%60;
    }

    public int[] getResult(int seconds) throws GlobalException { SecondsInDayValidator validator = new SecondsInDayValidator();
        if (!validator.validate(seconds))
        {
            throw new GlobalException("seconds interval is 0-86400");
        }
        int[] res = {calcHours(seconds), calcMinutes(seconds), calcSeconds(seconds)};
        return res;
    }
}
