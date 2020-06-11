package entity;

public class point {
    public double x, y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToPoint(double x, double y) {

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public int closerToStartPos(point _point) {
        int res;
        if (distanceToPoint(0, 0) < _point.distanceToPoint(0, 0)) {
            res = 1;
        } else {
            res = 0;
        }

        if (distanceToPoint(0, 0) == _point.distanceToPoint(0, 0)) {
            res = -1;
        }
        return res;
    }
}
