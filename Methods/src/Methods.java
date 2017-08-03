/**
 * Created by machu on 2017-03-12.
 */
public class Methods {



    public static void main(String[] args) {
        Methods metody = new Methods();
        int s = 127;

        System.out.println("Number: " + s);
        System.out.println("isSquareOfInteger? " + metody.isSquareOfInteger(s));
        System.out.println("isPrime? " + metody.isPrime(s));
        System.out.println("isCubeOfInteger? " + metody.isCubeOfInteger(s));
        System.out.println("numberOfDividors? " + (metody.numberOfDividors(s)));
        System.out.println("maxDividorsInRange? " + metody.maxDividorsInRange(s));
    }

    public boolean isSquareOfInteger(int n){
        for (int i=1; i <= n/2;i++){
            if (i*i==n) return true;
        }
        return false;
    }
    public boolean isCubeOfInteger(int n){
        for (int i=1; i <= n/2;i++){
            if (i*i*i==n) return true;
        }
        return false;
    }

    public boolean isPrime(int n){
        if (n<2) return false;
        if (n==2) return true;
        for (int i=2;i<n/2;i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public int numberOfDividorsRec(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        int dividorsNumber=1;
        for (int i=2; i<=n/2;i++){
            if ((n%i)==0){
                dividorsNumber+= numberOfDividorsRec(n/i);
                return dividorsNumber;
            }
        }
        return dividorsNumber;
    }

    public int numberOfDividors(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if (isPrime(n)) return 2;
        return numberOfDividorsRec(n)+2;
    }

    public int maxDividorsInRange(int n){
        int max=2;
        int numberWithMaxDividors = 1;
        int currentDividors;
        for (int i=1; i<=n; i++){
            currentDividors=numberOfDividors(i);
            if (currentDividors>max){
                max=currentDividors;
                numberWithMaxDividors = i;
            }
        }
        return numberWithMaxDividors;
    }
}
