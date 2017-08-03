package Points;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", z=" + z;
    }

    public double distanceToPoint(double x, double y, double z) {
        return Math.sqrt(
                Math.pow((this.x - x),2)
                + Math.pow((this.y - y),2)
                + Math.pow((this.z - z),2));
    }

    public double distanceToPoint(Point3D point) {
      return distanceToPoint(point.getX(),point.getY(), point.getZ());
//  return Math.sqrt(
//                (x - point.x) * (x - point.getX(x))
//                + (y - point.y) * (y - point.y)
//                + (z - point.z) * (z - point.z));
    }
}
