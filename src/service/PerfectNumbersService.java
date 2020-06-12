package service;

import java.util.ArrayList;

public class PerfectNumbersService {

    private ArrayList<Integer> getDivs(int num)
    {
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                out.add(i);
            }
        }
        return out;
    }

    private boolean checkSum(ArrayList<Integer> divs, int num)
    {
        int sum = 0;
        for (Integer integer : divs) {
            sum += integer;
        }
        if (num == sum)
            return true;
        else
            return false;
    }

    public boolean calcResult(int number)
    {
        return checkSum(getDivs(number), number);
    }
}
