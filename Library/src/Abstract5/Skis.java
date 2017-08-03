package Abstract5;

/**
 * Created by machu on 2017-03-19.
 */
public class Skis extends SlopeGear{
    @Override
    public void sharpen() {
        System.out.println("Skis: naostrzono.");
    }

    @Override
    public void wax() {
        System.out.println("Skis: nasmarowano.");
    }

    @Override
    public void regenerate() {
        System.out.println("Skis: zregenerowano.");
    }
}

