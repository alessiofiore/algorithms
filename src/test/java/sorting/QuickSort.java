package sorting;

import org.junit.Test;

/**
 * @author alessio
 */
public class QuickSort {

    @Test
    public void test() {
        int[] array = {4,2,456,67,23,5,6,1};
        print(array);
        quicksort(array, 0, array.length -1);
        print(array);
    }

    public void quicksort(int[] array, int i, int j) {
        int index = partition(array, i, j);
        if(i < index -1) {
            quicksort(array, i, index -1);
        }
        if(index < j) {
            quicksort(array, index, j);
        }
    }

    private int partition(int[] array, int i, int j) {
        int p = array[j];
        while(i < j) {
            while (array[i] < p) {
                i++;
            }
            while (array[j] > p) {
                j--;
            }
            if (i < j) {
                int val = array[j];
                array[j] = array[i];
                array[i] = val;
                i++;
                j--;
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
