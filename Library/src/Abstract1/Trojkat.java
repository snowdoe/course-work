package Abstract1;

/**
 * Created by machu on 2017-03-19.
 */
public class Trojkat implements Figura {

    private final float bokA;
    private final float bokB;
    private final float bokC;

    @Override
    public float obwod() {
        return bokA+bokB+bokC;
    }

    @Override
    public float pole() {
        float p = obwod()/2;
        return (float)Math.sqrt(p*(p-bokA)*(p-bokB)*(p-bokC));
    }

    @Override
    public int liczbaBokow() {
        return 3;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", pole="+pole()+
                ", obwod="+obwod()+
                '}';
    }

    public Trojkat(float bokA, float bokB, float bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }
}
