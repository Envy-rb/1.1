package validator;

public class secondsValidator {
    public boolean validate(int seconds)
    {
        return (seconds > 0 && seconds <= 86400);
    }
}
