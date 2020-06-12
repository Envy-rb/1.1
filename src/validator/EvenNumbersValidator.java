package validator;

public class EvenNumbersValidator {
    public boolean validate(int ... nums)
    {
        return nums.length <= 4 && nums.length > 0;
    }
}
