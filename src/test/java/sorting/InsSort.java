package sorting;

import org.junit.Test;

/**
 * @author alessio
 */
public class InsSort {

    @Test
    public void test() {
        int[] array = {4,2,456,67,23,5};
        print(array);
        sort(array);
        print(array);
    }

    private void sort(int[] array) {
        int j = 1;
        while (j < array.length) {
            int i = j - 1;
            while (i >= 0 && array[i+1] < array[i]) {
                int val = array[i+1];
                array[i+1] = array[i];
                array[i] = val;
                i--;
            }
            j++;
        }
    }

    private void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
