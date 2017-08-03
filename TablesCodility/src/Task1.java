public class Task1 {

    public static void main(String[] args) {

        Task1 task= new Task1();
        task.testTask1();

    }

    public void printTable (int [] table){
                for (int i= 0; i<=table.length -1; i++) System.out.print(table[i]+ " " );
    }

    public int [] shiftXTimes(int [] source, int X){

        for (int i=1; i<=X; i++)
            source = shiftOneTime(source);
        return source;
        }

    public int [] shiftOneTime (int [] source){

        int [] result = new int[source.length];;

        result[0] = source[source.length -1];

        for (int i = 1; i<=source.length-1;i++){
            result[i] = source[i-1];
        }
        return result;

    }
    public void testTask1 (){

        int [] testTable = {1,2,3,4};

        printTable(testTable);
        System.out.println();

        int testX = 3;

        int [] testResult = shiftXTimes(testTable,testX);

        printTable(testResult);



    }

}
