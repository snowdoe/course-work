import org.junit.Assert;
        import org.junit.Test;

import java.util.Collections;

/**
 * Created by machu on 2017-06-24.
 */
public class Test1 {
    TableEx Table = new TableEx();

    @Test
    public void TestFirstCase() {

        int [] Z = {1,2,3};
        int [] X = {4,5,6};
        int [] C = {7,8,9};
        int [] V = {11,12,13};
        int [][] A = {Z,X,C,V};

        Assert.assertEquals(-1,Table.TableMaxA(A));

    }
    @Test
    public void TestSecondCase() {

        int[] Z = {10002, 2, 3};
        int[] X = {4, 5, 6};
        int[] C = {7, 8, 9};
        int[] V = {11, 12, 13};
        int[][] A = {Z, X, C, V};

        Assert.assertEquals(10002, Table.TableMaxA(A));

    }
    @Test
    public void TestThirdCase() {

        int [] Z = {1,2,3};
        int [] X = {4,5,6};
        int [] C = {7,8,9};
        int [] V = {1100,12,13};
        int [][] A = {Z,X,C,V};

        Assert.assertEquals(1100,Table.TableMaxA(A));

    }
    @Test
    public void TestFourthCase() {

        int [] Z = {1,6};
        int [] X = {2,3};

        int [][] A = {Z,X};

        Assert.assertEquals(6,Table.TableMaxA(A));

    }
}

