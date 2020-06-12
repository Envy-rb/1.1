package service;

import exception.GlobalException;
import validator.EvenNumbersValidator;

public class GetBoolService
{
    public boolean result(int ... numbers) throws GlobalException {
        EvenNumbersValidator validator = new EvenNumbersValidator();
        if (!validator.validate(numbers))
        {
            throw new GlobalException("Count of numbers must be 4");
        }
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
