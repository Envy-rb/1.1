package service;

import exception.globalException;

public class function2Service {
    double a, b, h;

    public function2Service(double a, double b, double h) throws globalException {
        this.a = a;
        this.b = b;
        if (h == 0)
        {
            throw new globalException("Step cant be 0");
        }
        else {
            this.h = h;
        }
    }

    private double getResult(double inp)
    {
        return Math.tan(inp);
    }

    public String calcTable()
    {
        String res = "";
        for (double i = a; i < b; i+=h)
        {
            res += String.format("X = %3f | F(x) = %5f \n", i, getResult(i));
        }
        return res;
    }
}
