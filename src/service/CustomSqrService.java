package service;

public class CustomSqrService {

        private int calcLastDigit(int inp)
        {
            return inp%10;
        }

        public int lastDigitPow(int num)
        {
            int res = calcLastDigit(num);
            res *= res;
            res %= 10;
            return res;
        }
}
