package modelik;

import java.util.*;

/**
 * Created by machu on 2017-03-18.
 */
public class Game {
    private String name;
    private List<Player> players;
    private Player winner;
    private int round;


    void runGame() {
        setGameName();
        while (!hasAtLeast2Players()) addPlayers();
        do {
            nextRound();
        } while (!hasWinner());

        System.out.println("Zwyciezca gry " + name + " po " + round + " rundach jest: " + winner.fullName());
    }

    private void setGameName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj nazwe gry: ");
        name = s.nextLine();
    }

    private void addPlayers() {
        int n;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Ilu bedzie graczy?");
            n = s.nextInt();
            if (n < 2) System.out.println("Musi byc co najmniej 2 graczy!!");
        } while (n < 2);
        for (int i = 0; i < n; ++i) {
            inputPlayerDetails(i + 1);
        }
    }

    private void inputPlayerDetails(int playerNumber) {
        String name, surname;
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj imie gracza " + playerNumber + " :");
        name = s.nextLine();
        System.out.println("Podaj nazwisko gracza " + playerNumber + " :");
        surname = s.nextLine();
        Player newPlayer = new Player(name, surname);
        addPlayer(newPlayer);
    }

    private void nextRound() {
        if (hasAtLeast2Players()) {
            round++;
            Random ran = new Random();
            int range = 20;
            for (Player p : players) {
                int r = ran.nextInt(range);
                p.addPoints(r);
            }
            showScore();
            checkForWinner();
        }
    }

    private void checkForWinner() {
        Collections.sort(players);
        if ((players.get(players.size() - 1)).getPoints() >= 100)
            winner = players.get(players.size() - 1);
    }

    private void showScore() {
        if (hasAtLeast2Players()) {
            System.out.println("--------RUNDA >" + round + "< --------");
            System.out.println();
            for (Player p : players) {
                System.out.println(p.fullName() + " ma " + p.getPoints() + " punktow.");
                System.out.println();
            }
        }
    }

    private boolean hasWinner() {
        return winner != null;
    }

    private void addPlayer(Player newPlayer) {
        players.add(newPlayer);
    }

    private boolean hasAtLeast2Players() {
        return players.size() > 1;
    }

    Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.winner = null;
        this.round = 0;
    }

    public Game(String name, List<Player> playerList) {
        this.name = name;
        this.players = playerList;
        this.winner = null;
        this.round = 0;
    }
}

