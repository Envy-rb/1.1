package validator;

public class SecondsValidator {
    final int secondsInDay = 85400;
    public boolean validate(int seconds)
    {
        return (seconds > 0 && seconds <= secondsInDay);
    }
}
