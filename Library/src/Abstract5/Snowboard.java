package Abstract5;

/**
 * Created by machu on 2017-03-19.
 */
public class Snowboard extends SlopeGear {
    @Override
    public void sharpen() {
        System.out.println("Snowboard: naostrzono.");
    }

    @Override
    public void wax() {
        System.out.println("Snowboard: nasmarowano.");
    }

    @Override
    public void regenerate() {
        System.out.println("Snowboard: zregenerowano.");
    }
}
