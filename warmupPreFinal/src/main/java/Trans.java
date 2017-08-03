import java.util.Arrays;

/**
 * Created by machu on 2017-06-25.
 */
public class Trans {
    double matrix [][];

    public void transpose(){

        for (int i = 0; i<matrix.length; i++){
            for (int j=i+1;j<matrix.length;j++){
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        String value = new String();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){

                value+=(String.valueOf(matrix[i][j])+' ');
            }
            value+='\n';
        }
        return value;
    }
}
