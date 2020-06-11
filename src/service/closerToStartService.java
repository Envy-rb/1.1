package service;

import entity.point;

public class closerToStartService {
    point point1, point2;

    public closerToStartService(point point1, point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public int calcResult ()
    {
        int res = point1.closerToStartPos(point2);
        return res;
    }
}

