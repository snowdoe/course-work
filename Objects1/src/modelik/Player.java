package modelik;


public class Player implements Comparable<Player> {

    private String name, surname;
    private int points;

    public String fullName(){

        return name+" "+surname;

    }


    public Player(String name, String surname, int points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public Player(String name, String surname) {
        this(name, surname, 0);

    }
    public void addPoints(int n){
        points+=n;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }



    @Override
    public int compareTo(Player o) {
        return (this.points - o.points);
    }
}
