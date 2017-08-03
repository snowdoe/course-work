package Abstract1;


public class Kwadrat extends Czworokat {
    private final float dlugoscBoku;

    public Kwadrat(float dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public float obwod() {
        return 4*dlugoscBoku;
    }

    @Override
    public float pole() {
        return dlugoscBoku*dlugoscBoku;
    }

    @Override
    public int liczbaBokow() {
        return 3;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "dlugoscBoku=" + dlugoscBoku +
                ", pole="+pole()+
                ", obwod="+obwod()+
                '}';
    }
}
