import java.awt.*;
public class Exercise_2 {

    void pointInfo(Point point1) {
        System.out.println("The coordinate of the point is: (" + point1.getX() + "," + point1.getY() + ")");
    }

    void distance (Point point1, Point point2) {
        double dist = Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
        System.out.println("The distance between two points is: " + dist);
    }

    void expected () {
        System.out.println("Expected value is: 10.0\n");
    }
}
