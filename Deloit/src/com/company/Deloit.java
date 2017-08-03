package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Deloit {

    public Deloit() {
    }

    public static void main(String[] args) {

        Deloit rozwiazania = new Deloit();
        System.out.println("Zadanie 1:");
        System.out.println("----------");
        rozwiazania.deloit1();
        System.out.println("Zadanie 2:");
        System.out.println("----------");
        rozwiazania.deloit2();
        System.out.println("Zadanie3:");
        System.out.println("----------");
        rozwiazania.deloit3();

    }

    public void deloit3(){

        int [] A = {1,-1,0,2,3,5};
        int range;
        int result = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("Tablica A: ");
        for(int k=0; k<=A.length-1;k++)
             System.out.print(A[k]+" ");
        System.out.println();
        System.out.println("Podaj zasieg skoku zaby: ");
        range = input.nextInt();
        System.out.println("Zasieg skoku : "+range);



        for(int i = 0; i<A.length-1;i++){

            if (pathExists(A,i,range)) {
                result = i;
                break;
            }

        }
        System.out.println("Zaba przeskoczy na druga strone najwczesniej po czasie : "+result);

    }
    public boolean pathExists(int [] pathMatrix, int currentTime, int jumpRange){

        boolean tempPathExists = false;

        //for(int k=0; k<=pathMatrix.length-1;k++)
        //     System.out.print(pathMatrix[k]+" ");

        if (jumpRange>pathMatrix.length) {
            //  System.out.println("Pathlength: " +pathMatrix.length);
            return true;
        }
        for(int k = 0;k<pathMatrix.length-1;k++) {
            if ((currentTime >= pathMatrix[k]) && (pathMatrix[k] != -1) && (jumpRange >= k)) {
                int[] subMatrix = Arrays.copyOfRange(pathMatrix, k + 1, pathMatrix.length);
                for (int l = 0; l <= subMatrix.length - 1; l++) {
                    //      System.out.print(subMatrix[l]+" ");
                    // System.out.println("Time:" +currentTime);
                    //  System.out.println("Level:" +level);
                    tempPathExists = pathExists(subMatrix, currentTime, jumpRange);
                    if (tempPathExists) return true;
                }
            }
        }
        return false;
    }

    public void deloit2(){
        String wordOne;
        int numberOfOpeningBrackets, numberOfClosingBrackets;
        int passedOpen=0, passedClosed = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj string z nawiasami (): ");
        wordOne = input.nextLine();
        numberOfOpeningBrackets = wordOne.split("\\(",-1).length - 1;
        numberOfClosingBrackets = wordOne.split("\\)",-1).length - 1;

        for (int i= 0; i<wordOne.length(); i++){

            if (wordOne.charAt(i)=='(') passedOpen++;
            if (wordOne.charAt(i)==')') passedClosed++;

            if (passedOpen == (numberOfClosingBrackets-passedClosed)) {
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
        //System.out.println(toDigits);
        for (int i = 0,j=0; i< toDigits.length();i++,j++){

            if (j==3) {
                toFinalDigits += "-";
                j = 0;
            }
            toFinalDigits += toDigits.charAt(i);


        }
        System.out.println(toFinalDigits);

    }
}
