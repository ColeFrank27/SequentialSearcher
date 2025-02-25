public class SequentialSearcher {

    int[] myArray = { 1, 2, 3, 4, 5 };

    // finds the first occourence of the value parameter in the array and returns
    // the index of that occourence or -1

    public static int find(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (value == array[i]) {

                return i;
            }
        }

        return -1;

    }

    // get an array with only the even numbers of the other array

    public static int[] even(int[] array) {

        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                evenCount++;
            }

        }

        int evenIndexCount = -1;

        int[] even = new int[evenCount];
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                evenIndexCount++;
                even[evenIndexCount] = array[i];
            }

        }

        return even;
    }

    // largest num

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {

            if (i > max) {
                max = i;
            }
        }

        return max;

    }

    // sum

    public static int sum(int[] array) {

        int sum = 0;

        for (int i : array) {

            sum += i;

        }

        return sum;
    }

}