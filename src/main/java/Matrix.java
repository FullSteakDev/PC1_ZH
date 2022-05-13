import java.util.ArrayList;

public class Matrix {

    public Matrix() {
    }

    public static int countNumbersDivisibleBySeven(int[][] matrix) {

        int byseven = 0;
        ArrayList<Integer> m = new ArrayList<>();
        for (int[] num : matrix) {
            for (int h : num) {
                m.add(h);
            }
        }
        for (int i = 0; i < m.size(); i++) {
            if ((m.get(i) / 7) >= 0)
                byseven += m.get(i);
        }

        return byseven;
    }

    public static ArrayList<Integer> columnsWithMax(int[][] matrix) {
        ArrayList<Integer> max = new ArrayList<>();
    }
}