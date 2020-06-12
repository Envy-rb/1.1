package exception;

public class GlobalException extends Exception{
    private final String info;
    public GlobalException(String info)
    {
        this.info = info;
    }
}
