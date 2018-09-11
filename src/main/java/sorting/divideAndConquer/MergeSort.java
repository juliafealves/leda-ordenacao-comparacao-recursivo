package sorting.divideAndConquer;

import sorting.AbstractSorting;

/**
 * Merge sort is based on the divide-and-conquer paradigm. The algorithm
 * consists of recursively dividing the unsorted list in the middle, sorting
 * each sublist, and then merging them into one single sorted list. Notice that
 * if the list has length == 1, it is already sorted.
 */
public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex && leftIndex >= 0 && rightIndex < array.length) {
            int middle = ((leftIndex + rightIndex) / 2);
            this.sort(array, leftIndex, middle);
            this.sort(array, middle + 1, rightIndex);
            this.merge(array, leftIndex, middle, rightIndex);
        }
    }

    private void merge(T[] array, int leftIndex, int middle, int rightIndex) {
        T[] copy = (T[]) new Comparable[array.length];

        for (int i = leftIndex; i <= rightIndex; i++) {
            copy[i] = array[i];
        }

        int i = leftIndex;
        int l = leftIndex;
        int m = middle + 1;

        while (l <= middle && m <= rightIndex) {
            if (copy[l].compareTo(copy[m]) < 0) {
                array[i] = copy[l];
                l++;
            } else {
                array[i] = copy[m];
                m++;
            }

            i++;
        }

        while (l <= middle) {
            array[i] = copy[l];
            l++;
            i++;
        }

        while (m <= rightIndex) {
            array[i] = copy[m];
            m++;
            i++;
        }
    }
}
