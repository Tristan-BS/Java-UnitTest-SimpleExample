package UnitTesting;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    protected <T extends Comparable<T>> ArrayList<T> Algorithm(ArrayList<T> SortedArray) {
        try {
            if (SortedArray == null) {
                throw new NullPointerException("Array is null");
            }else if (SortedArray.isEmpty()) {
                System.out.println("Array is empty");
                return SortedArray;
            }

            boolean swapped;
            for (int i = 0; i < SortedArray.size() - 1; i++) {
                swapped = false;
                for (int j = 0; j < SortedArray.size() - 1 - i; j++) {
                    if (SortedArray.get(j).compareTo(SortedArray.get(j + 1)) > 0) {
                        Collections.swap(SortedArray, j, j + 1);
                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return SortedArray;
    }

}
