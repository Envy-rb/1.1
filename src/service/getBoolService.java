package service;

import exception.globalException;
import validator.evenNumbersValidator;

public class getBoolService
{
    int[] numbers = new int[4];
    public getBoolService(int ... inp) throws globalException {
        evenNumbersValidator validator = new evenNumbersValidator();
        if (!validator.validate(inp))
        {
            throw new globalException("Count of numbers must be 4");
        }
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = inp[i];
        }
    }
    public boolean result()
    {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                counter++;
        }
        if(counter >= 2)
            return true;
        else
            return false;
    }
}
