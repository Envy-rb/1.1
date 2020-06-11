package service;

public class customSqrService {
        private int num;

        public customSqrService(int num)
        {
            this.num = num;
        }

        private int calcLastDigit(int inp)
        {
            return inp%10;
        }

        public int lastDigitPow()
        {
            int res = calcLastDigit(num);
            res *= res;
            res %= 10;
            return res;
        }
}
