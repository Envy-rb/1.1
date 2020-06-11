package service;

public class function1Service {
    double argument;

    public function1Service(double argument) {
        this.argument = argument;
    }

    public double calcResult()
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
