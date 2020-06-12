package service;

import exception.GlobalException;

public class Function2Service {

    private double calcResult(double inp)
    {
        return Math.tan(inp);
    }

    public String calcTable(double a, double b, double h) throws GlobalException {
        if (h == 0)
        {
            throw new GlobalException("Step cant be 0");
        }
            String res = "";
            for (double i = a; i < b; i += h) {
                res += String.format("X = %3f | F(x) = %5f \n", i, calcResult(i));
            }
        return res;
    }
}
