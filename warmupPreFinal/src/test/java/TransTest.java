import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by machu on 2017-06-25.
 */
public class TransTest {

    Trans trans = new Trans();
    @Test
    public void testCaseOne(){

        double [] row1 = {1,2,3};
        double [] row2 = {4,5,6};
        double [] row3 = {7,8,9};

        double [][] testMatrix = {row1,row2,row3};

        trans.setMatrix(testMatrix);
        System.out.println("Przed transpo: \n"+ trans);
        trans.transpose();
        System.out.println("Po transpo: \n" + trans);




    }
    @Test
    public void testCaseTwo(){

        boolean testPassed= true;

        double [][] testMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        double [][] testClone = {{1,2,3},{4,5,6},{7,8,9}};

        trans.setMatrix(testMatrix);

        trans.transpose();

        for (int i = 0; i<testClone.length; i++){

            for (int j=i+1;j<testClone.length;j++){

                if(testClone[i][j]!=trans.getMatrix()[j][i]){

                    testPassed = false;
                    break;
                }

            }
            Assert.assertTrue(testPassed);

        }


    }
}
