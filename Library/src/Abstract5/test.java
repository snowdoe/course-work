package Abstract5;

/**
 * Created by machu on 2017-03-19.
 */
public class test {

    public static void prepareSlopeGear(SlopeGear gear){
        gear.regenerate();
        gear.sharpen();
        gear.installBindings();
        gear.setBindings();
        gear.wax();

    }
    public static void prepareRinkGear(RinkGear gear){
        gear.sharpen();

    }
    public static void main(String[] args) {
        Skis skis = new Skis();
        Snowboard snowboard = new Snowboard();
        IceSkates iceskates = new IceSkates();
        SlopeGear testSlope1 = skis;
        SlopeGear testSlope2 = snowboard;
        RinkGear testRink = iceskates;

        prepareSlopeGear(testSlope1);
        prepareSlopeGear(testSlope2);
        prepareRinkGear(testRink);


    }
}
