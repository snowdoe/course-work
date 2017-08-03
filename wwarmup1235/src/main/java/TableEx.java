/**
 * Created by machu on 2017-06-24.
 */
public class TableEx {
    public static int TableMaxA (int[][] T){

        int tempSum=0;
        int returnValue=0;

        for (int i=0;i<T.length;i++){
            for (int j : T[i]){
                if (j>returnValue) returnValue = j;
                tempSum+=j;
            }
        }
        if (returnValue>=tempSum-returnValue)return returnValue;
        return -1;

    }
}
