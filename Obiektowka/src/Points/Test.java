package Points;

/**
 * Created by machu on 2017-04-02.
 */
public class Test {
    public static void main(String[] args) {
        Point3D point1 = new Point3D(1,2,3);
        Point3D point2 = new Point3D(2,3,4);

        System.out.println("\nPoint1: "+point1+"\nPoint2: "+point2+ "\nDistance: " +point1.distanceToPoint(point2));
    }
}
