package service;

public class Function1Service {

    public double calcResult(double argument)
    {
        double result;
        if (argument < 3)
        {
            result = 1/(Math.pow(argument, 3) - 6);
        }
        else
        {
            result = -Math.pow(argument, 2) + 3*argument + 9;
        }
        return result;
    }
}
