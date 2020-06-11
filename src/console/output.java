package console;


public class output {
    public void print(String separator, String ... args)
    {
        for (String arg : args)
        {
            System.out.print(new StringBuilder(arg + separator));
        }
    }
}
