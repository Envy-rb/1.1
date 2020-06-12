package validator;

public class YearValidator {
    public boolean validate(int year, int month)
    {
        return year > 0 && month <= 12 && month > 0;
    }
}
