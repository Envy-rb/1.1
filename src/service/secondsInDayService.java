package service;

import exception.globalException;
import validator.secondsInDayValidator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class secondsInDayService {
    int seconds;
    public secondsInDayService(int seconds) throws globalException {
        secondsInDayValidator validator = new secondsInDayValidator();
        if (!validator.validate(seconds))
        {
            throw new globalException("seconds interval is 0-86400");
        }
        else {
            this.seconds = seconds;
        }
    }

    private int calcHours()
    {
        return seconds/3600;
    }
    private int calcMinutes()
    {
        return (seconds/60)%60;
    }
    private int calcSeconds()
    {
        return seconds%60;
    }

    public int[] getResult()
    {
        int[] res = {calcHours(), calcMinutes(), calcSeconds()};
        return res;
    }
}
