package Abstract1;

/**
 * Created by machu on 2017-03-19.
 */
public class Prostokat extends Czworokat{
    private final float bokA;
    private final float bokB;

    public Prostokat(float bokA, float bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public float obwod() {
        return 2*bokA + 2*bokB;
    }

    @Override
    public float pole() {
        return bokA*bokB;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", pole="+pole()+
                ", obwod="+obwod()+
                '}';
    }
}
