package sorting;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author alessio
 */
public class MergeSort {


    @Test
    public void test() {
        int[] array = {4,2,456,67,23,5};
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public void mergeSort(int[] array, int beg, int end) {
        if(beg < end) {
            int mid = (beg+end)/2;
            mergeSort(array, beg, mid);
            mergeSort(array, mid+1, end);
            merge(array, beg, mid, end);
        }
    }

    private void merge(int[] array, int beg, int mid, int end) {
        int[] left = new int[mid - beg + 1];
        int[] right = new int[end - mid];
        for(int i = 0; i < left.length; i++) {
            left[i] = array[beg + i];
        }
        for(int i = 0; i < right.length; i++) {
            right[i] = array[mid + i + 1];
        }

        int i=0, j=0;
        while (i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                array[beg + i + j] = left[i];
                i++;
            } else {
                array[beg + i + j] = right[j];
                j++;
            }
        }

        while (i < left.length) {
            array[beg + i + j] = left[i];
            i++;
        }
        while (j < right.length) {
            array[beg + i + j] = right[j];
            j++;
        }
    }
}
