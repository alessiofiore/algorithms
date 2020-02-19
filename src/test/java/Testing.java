import org.junit.Test;

/**
 * @author alessio
 */
public class Testing {

    @org.junit.Test
    public void test() {
        int[] array = {4,2,456,67,23,5,6,1};
        print(array);
        quicksort(array, 0, array.length-1);
        print(array);
    }

    private void quicksort(int[] array, int i, int j) {
        int m = partition(array, i, j);
        if(i < m) {
            quicksort(array, i, m);
        }
        if(j > m+1) {
            quicksort(array, m+1, j);
        }
    }

    private int partition(int[] array, int i, int j) {
        int m = (i+j)/2;
        int p = array[m];

        while (i < j) {
            while (array[i] < p) {
                i++;
            }
            while (array[j] > p) {
                j--;
            }

            if(i < j) {
                int val = array[j];
                array[j] = array[i];
                array[i] = val;
            }
        }
        return i;
    }


    private void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
