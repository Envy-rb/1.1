package validator;

public class secondsInDayValidator {
    final int secondsInDay = 86400;
    public boolean validate(int seconds)
    {
        return seconds > 0 && seconds < secondsInDay;
    }
}
