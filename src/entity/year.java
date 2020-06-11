package entity;

public class year {
    private int yearNum, monthNum;
    private boolean leapYear;
    public year(int yearNum, int monthNum)
    {
        this.yearNum = yearNum;
        this.monthNum = monthNum;
        leapYear = isLeap();
    }

    private boolean isLeap()
    {
        if (yearNum > 0)
            return ((yearNum%4 == 0 && yearNum%100 != 0) || (yearNum%100 == 0 && yearNum%400 == 0));
        else
            return false;
    }

    public boolean getLeap()
    {
        return leapYear;
    }

    public int daysInMonth()
    {
        int[] count = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] countLeap = {30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNum > 0 && monthNum < 13)
            return (leapYear?(countLeap[monthNum - 1]):(count[monthNum - 1]));
        else
            return -1;
    }
}
