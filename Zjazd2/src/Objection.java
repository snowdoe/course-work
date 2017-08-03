import java.util.Random;

/**
 * Created by machu on 2017-03-18.
 */
public class Objection {

    public static int[][] wypelnijTablice() {
        final int n = 5;
        final int m = 6;

        int pustaTablica[][] = new int [n][m];

        Random random = new Random();
        for(int wiersz = 0; wiersz < n; ++wiersz) {
            for(int kolumna = 0; kolumna < m; ++kolumna) {
                int wartosc = random.nextInt(200) - 100;
                pustaTablica[wiersz][kolumna] = wartosc;
                String msg = String
                        .format("w: %d, k: %d, v: %d", wiersz, kolumna, wartosc);
                System.out.println(msg);
            }
        }

        return pustaTablica;
    }

    public static void wydrukujTablice(int[][] doDruku) {
        for(int wiersz = 0; wiersz < doDruku.length; ++wiersz) {
            int [] calyWiersz = doDruku[wiersz];
            for(int kolumna = 0; kolumna < calyWiersz.length; ++kolumna) {
                System.out.print(calyWiersz[kolumna] + " ");
            }
            System.out.println();
        }
    }

    public static int minimalnyElement(int[][] tablica) {
        int min = Integer.MAX_VALUE;
        for(int wiersz = 0; wiersz < tablica.length; ++wiersz) {
            int[] calyWiersz = tablica[wiersz];
            for(int kolumna = 0; kolumna < calyWiersz.length; ++kolumna) {
                if(calyWiersz[kolumna] < min) {
                    min = calyWiersz[kolumna];
                }
            }
        }
        return min;
    }

    public static int maksymalnyElement(int[][] tablica) {
        int max = Integer.MIN_VALUE;
        for(int wiersz = 0; wiersz < tablica.length; ++wiersz) {
            int[] calyWiersz = tablica[wiersz];
            for (int kolumna = 0; kolumna < calyWiersz.length; ++kolumna) {
                if(calyWiersz[kolumna] > max) {
                    max = calyWiersz[kolumna];
                }
            }
        }
        return max;
    }

    public static int sumaElementow(int[][] tablica) {
        int suma = 0;
        for(int wiersz = 0; wiersz < tablica.length; ++wiersz) {
            int[] calyWiersz = tablica[wiersz];
            for(int kolumna = 0; kolumna < calyWiersz.length; ++ kolumna) {
                suma = suma + calyWiersz[kolumna];
//                suma += calyWiersz[kolumna];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int wypelnionaTablica[][] = wypelnijTablice();
        wydrukujTablice(wypelnionaTablica);
        System.out.println("Max: " + maksymalnyElement(wypelnionaTablica));
        System.out.println("Min: " + minimalnyElement(wypelnionaTablica));
        System.out.println("Suma: " + sumaElementow(wypelnionaTablica));
    }

}
