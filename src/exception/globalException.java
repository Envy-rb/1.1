package exception;

public class globalException extends Exception{
    private final String info;
    public globalException(String info)
    {
        this.info = info;
    }
}
