package service;

import entity.Point;

public class CloserToStartService {

    public int calcResult (Point point1, Point point2)
    {
        Point _point1, _point2;
        _point1 = point1;
        _point2 = point2;
        int res = point1.closerToStartPos(point2);
        return res;
    }
}

