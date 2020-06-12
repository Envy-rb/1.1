package validator;

public class SecondsInDayValidator {
    final int secondsInDay = 86400;
    public boolean validate(int seconds)
    {
        return seconds > 0 && seconds < secondsInDay;
    }
}
