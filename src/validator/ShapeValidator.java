package validator;

public class ShapeValidator {
    public boolean validate(double ... sides)
    {
        boolean result = true;
        for (double side : sides)
        {
            if (side <= 0)
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
