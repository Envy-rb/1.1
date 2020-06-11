package validator;

public class evenNumbersValidator {
    public boolean validate(int ... nums)
    {
        return nums.length <= 4 && nums.length > 0;
    }
}
