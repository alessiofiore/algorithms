package sorting;

import org.junit.Test;

/**
 * @author alessio
 */
public class SelectionSort {

    @Test
    public void sort() {
        int[] array = {4, 8, 2, 9, 4, 7, 1};
        print(array);
        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            if(min > i) {
                int val = array[i];
                array[i] = array[min];
                array[min] = val;
            }
        }
        print(array);
    }

    private void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
