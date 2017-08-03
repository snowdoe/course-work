package Abstract5;

/**
 * Created by machu on 2017-03-19.
 */
public abstract class SlopeGear extends WinterGear implements SkiBindings{

    public abstract void wax();
    public abstract void regenerate();

    @Override
    public void installBindings() {
        System.out.println("SlopeGear : Zamonotowano wiazania.");
    }

    @Override
    public void setBindings() {
        System.out.println("SlopeGear : Ustawiono wiazania.");
    }

    @Override
    public void uninstallBindings() {
        System.out.println("SlopeGear : Odmontowano wiazania.");
    }
}
