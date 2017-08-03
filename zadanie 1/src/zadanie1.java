import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by machu on 2017-03-10.
 */
public class zadanie1 {
    private int start;
    private int koniec;

    public zadanie1() {
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setKoniec(int koniec) { this.koniec = koniec; }

    public int getKoniec() {
        return koniec;
    }

    public static void main(String[] args) {

       zadanie1 zadanie = new zadanie1();
       //zadanie.zadanko();
       // zadanie.podstawy();
       // zadanie.podstawy2();
       // zadanie.zadaniaString();
       // zadanie.deloit1();
        //zadanie.deloit2();
        zadanie.deloit3();





    }
    public void deloit3(){



        int [] A = {1,-1,0,2,3,5};
        int D = 1;
        int result = -1;

        for(int i = 0; i<A.length-1;i++){

                if (pathExists(A,i,D,0)) {
                result = i;
                break;
            }

        }
        System.out.println(result);

    }
    public boolean pathExists(int [] pathMatrix, int currentTime, int jumpRange,int level){

        boolean tempPathExists = false;

        //for(int k=0; k<=pathMatrix.length-1;k++)
       //     System.out.print(pathMatrix[k]+" ");
        System.out.println();
        if (jumpRange>pathMatrix.length) {
          //  System.out.println("Pathlength: " +pathMatrix.length);
            return true;
        }
        for(int k = 0;k<pathMatrix.length-1;k++){
            if ((currentTime>=pathMatrix[k])&&(pathMatrix[k]!=-1)&&(jumpRange>=k)){
                int[] subMatrix = Arrays.copyOfRange(pathMatrix, k+1, pathMatrix.length);
                for(int l=0; l<=subMatrix.length-1;l++)
              //      System.out.print(subMatrix[l]+" ");
               // System.out.println("Time:" +currentTime);
              //  System.out.println("Level:" +level);

                tempPathExists =pathExists(subMatrix,currentTime,jumpRange,level+1);
                if (tempPathExists) return true;

            }
        }
        return false;
    }

    public void deloit2(){
        String wordOne;
        int numberInFirstHalf, numberInSecondHalf;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj string z nawiasami (): ");
        wordOne = input.nextLine();

        for (int i= 1; i<wordOne.length()-1; i++){
            numberInFirstHalf = wordOne.substring(0,i).split("\\(",-1).length - 1;
            numberInSecondHalf = wordOne.substring(i+1,wordOne.length()-1).split("\\)",-1).length - 1;
            if (numberInFirstHalf == numberInSecondHalf) {
                System.out.println(i+1);
                break;
            }

        }


    }

    public void deloit1(){
        String wordOne;
        String toDigits = new String();
        String toFinalDigits = new String();
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj string: ");
        wordOne = input.nextLine();

        for (int i = 0; i< wordOne.length();i++){

            if (Character.isDigit(wordOne.charAt(i)))
                toDigits += wordOne.charAt(i);
        }
        System.out.println(toDigits);
        for (int i = 0,j=0; i< toDigits.length();i++,j++){

            if (j==3) {
                toFinalDigits += "-";
                j = 0;
            }
            toFinalDigits += toDigits.charAt(i);


        }
        System.out.println(toFinalDigits);

    }

    public void zadaniaString(){
        String wordOne;
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj wyraz: ");
        wordOne = input.nextLine();
        System.out.println("Podaj liczbe: ");
        number = input.nextInt();
        System.out.println("Dlugosc wyrazu "+wordOne+" to: "+wordOne.length());
        System.out.println("Ostatnie "+number+" liter(-y) z "+wordOne+" to: "+wordOne.substring(wordOne.length()-number));
        if ((wordOne.charAt(wordOne.length()-1) == 'm') || (wordOne.charAt(wordOne.length()-1)=='M'))
            System.out.println("Tak");
        else {
            System.out.println("Nie (" + wordOne.charAt(wordOne.length() - 1)+")");
        }
        if (Character.isDigit(wordOne.charAt(0)))
            System.out.println("Pierwsa litera z " +wordOne+" to cyfra!" );
        else
            System.out.println("Pierwsa litera z " +wordOne+" to nie cyfra!" );
        if (wordOne.charAt(0) == wordOne.charAt(wordOne.length()-1))
            System.out.println("Pierwsa znak z " +wordOne+" jest taki sam jak ostatni!" );
        else
            System.out.println("Pierwsa znak z " +wordOne+" jest innyu niz jak ostatni!" );
    }

    public void podstawy2(){

        int a,b,c, randomNumber;


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a:");
        a = input.nextInt();
        System.out.println("Podaj b:");
        b = input.nextInt();
        System.out.println("Podaj c:");
        c = input.nextInt();


        int [] table = {a,b,c};

        System.out.println("Srednia z " +a+" i "+b+" to: "+(double)(a+b)/2);
        System.out.println("Dla " +a+" miejsc, i "+b+" rzedow, w rzedzie bedzie:");
        System.out.println((a/b) + " miejsc");
        if (a%b!=0)
            System.out.println(", oprocz ostatniego, w ktorym bedzie: "+((a/b)+(a%b)) + " miesjc");




        Arrays.sort(table);
        System.out.println("Najmniejsz z liczb ktore podales to: " +table[0]);
        System.out.println("Najwieksza z liczb ktore podales to: " +table[2]);
        for (int i :table)
        {
            if (i%3!=0) System.out.println(i+" nie jest podzielna przez 3.");
            else System.out.println(i+" jest podzielna przez 3.");

        }

        System.out.println("10 losowych liczb z przedzialu 1 do " +a+" :");
        Random losowanie = new Random();

        for (int i = 0;i<10;i++)
        {
            randomNumber = losowanie.nextInt(a)+1;
            System.out.println(randomNumber);

        }

    }

    public void podstawy(){

        String imie = new String();
        String nazwisko = new String();
        int wiek;
        char firstLetter, lastLetter;


        System.out.println("Siema, jak masz na imie?");
        Scanner input = new Scanner(System.in);
        imie = input.nextLine();
        System.out.println("OK, masz na nazwisko?");
        nazwisko = input.nextLine();
        System.out.println("OK, ile masz lat?");
        wiek = input.nextInt();
        firstLetter = imie.charAt(0);
        lastLetter = nazwisko.charAt(0);
        System.out.println("Twoj wiek to: "+ wiek);
        System.out.println("Twoje inicjaly to "+ firstLetter + " " + lastLetter);
    }
    public void zadanko(){

            int liczba;
            Random losowanie = new Random();
            for ( int i = 0;i<10;i++)
            {
                liczba = losowanie.nextInt(2)+1;

                System.out.println(liczba);

            }


            int n = 7;
            for (int i = 1; i <= n; i++)
            {
                for(int k=0; k<(n-i);k++){
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++)
                {
                    System.out.print("* ");
                }


                System.out.println();
            }
            for (int i = 1; i <= n*2; i+=2)
            {
                for (int m = (n*2 - i) / 2; m > 0; m--)
                {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int k = 1; k < i; k++)
                {
                    System.out.print("*");
                }

                System.out.println();



            }
        System.out.println("siemka, podaj start");
        Scanner sc1 = new Scanner(System.in);
        setStart(sc1.nextInt()) ;
        System.out.println("siemka, podaj koniec");
        setKoniec (sc1.nextInt());
        System.out.println("Start: " + getStart());
        System.out.println("Koniec: " + getKoniec());
        System.out.println("Parzyste w tym przedziale:");


        if (getStart()%2 != 0) setStart(++start);
        for ( int i = getStart();i<=getKoniec();i+=2)
        {
            //if (i%2 == 0)
                System.out.println(i);

        }

    }
}
