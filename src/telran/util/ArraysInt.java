package telran.util;

import java.util.Arrays;

public class ArraysInt {
    public static int[] addNumber(int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public static int[] insertNumber(int[] array, int index, int number) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = number;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static int[] removeNumber(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    public static int[] insertSorted(int[] sortedArray, int number) {
        int index = Arrays.binarySearch(sortedArray, number);
        if (index < 0) {
            index = -index - 1;
        }
        int[] newArray = new int[sortedArray.length + 1];
        System.arraycopy(sortedArray, 0, newArray, 0, index);
        newArray[index] = number;
        System.arraycopy(sortedArray, index, newArray, index + 1, sortedArray.length - index);
        return newArray;
    }

    public static int binarySearchInt(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == key) {
                return mid; 
            }

            if (sortedArray[mid] < key) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }
}


//package telran.util;
//
//import java.util.Arrays;
//
//public class ArraysInt {
//    public static int[] addNumber(int[] array, int number) {
//        return insertNumber(array, array.length, number);
//    }
//
//    public static int[] insertNumber(int[] array, int index, int number) {
//        int[] newArray = new int[array.length + 1];
//        System.arraycopy(array, 0, newArray, 0, index);
//        newArray[index] = number;
//        if (index < array.length) {
//            System.arraycopy(array, index, newArray, index + 1, array.length - index);
//        }
//        return newArray;
//    }
//
//    public static int[] removeNumber(int[] array, int index) {
//        int[] newArray = new int[array.length - 1];
//        System.arraycopy(array, 0, newArray, 0, index);
//        if (index < array.length - 1) {
//            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
//        }
//        return newArray;
//    }
//
//    public static int[] insertSorted(int[] sortedArray, int number) {
//        int index = Arrays.binarySearch(sortedArray, number);
//        index = index < 0 ? -index - 1 : index;
//        return insertNumber(sortedArray, index, number);
//    }
//
//    public static int binarySearchInt(int[] sortedArray, int key) {
//        return Arrays.binarySearch(sortedArray, key) >= 0 ? Arrays.binarySearch(sortedArray, key) : -1;
//    }
//}
//
//
