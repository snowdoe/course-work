import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {

    private static boolean containsDuplicates(List<String> list) {

        return list.size() != new HashSet<>(list).size();

    }

    private static class Pokemon implements Comparable<Pokemon> {

        private static int numberOfPokemon = 0;
        private String name;

        public Pokemon(String name) {
            this.numberOfPokemon++;

            this.name = name;
        }

        public static int getNumberOfPokemon() {
            return numberOfPokemon;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public int compareTo(Pokemon o) {
            return name.compareTo(o.getName());
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {

        List<String> pokeNames = Arrays.asList("Pikachu", "Bulbasaur", "Charizard", "Slowpoke");
        List<Pokemon> myPokedeck = new LinkedList<>();
        for (String name : pokeNames) {
            myPokedeck.add(new Pokemon(name));
        }
        System.out.println(myPokedeck);
        Collections.sort(myPokedeck);
        System.out.println(myPokedeck);

    }

}
