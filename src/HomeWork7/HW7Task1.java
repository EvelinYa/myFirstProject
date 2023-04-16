package HomeWork7;

import java.util.Arrays;

public class HW7Task1 {
    public static void divideArrayElements(float[] arr, Integer divisor) throws IllegalArgumentException {

        if (divisor == null) {
            throw new IllegalArgumentException("Divisor can't be null.");
        }
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor must not be zero.");
        }
        if (arr == null) {
            throw new IllegalArgumentException("Array can't be null.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array can't be empty.");
        }

        float[] dividedArray = new float[arr.length];
        for (int i = 0; i < dividedArray.length; i++) {
            dividedArray[i] = arr[i] / divisor;
        }
        System.out.println(Arrays.toString(dividedArray));
    }

    public static void main(String[] args) {
        float[] arr = {2, 3, 4};
        Integer divisor = 2;
        try {
            divideArrayElements(arr, divisor);
        } catch (IllegalArgumentException e) {
            System.out.println("An ERROR occurred: One of arguments does no meet requirements.");
            e.printStackTrace();
        }
    }
}