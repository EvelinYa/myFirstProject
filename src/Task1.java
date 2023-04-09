public class Task1 {
    public static void minModuleValue(int[] arr) {

        long minDiff = (long) Integer.MAX_VALUE - (long) Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                long diff = Math.abs((long) arr[i] - (long) arr[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        System.out.println("The smallest value of the difference between numbers modulo: " + minDiff);
    }

    public static void main(String[] args) {
        int[] minValue = {5, 11, 7, 20};
        minModuleValue(minValue);
    }
}