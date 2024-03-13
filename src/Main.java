import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] centralPart = getArrayMiddle(numbers);

        System.out.println(Arrays.toString(centralPart));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length <= 2) {
            return numbers;
        }

        int[] arr = new int[numbers.length % 2 == 0 ? 2 : 1];

        if (numbers.length % 2 == 0) {
            System.arraycopy(numbers, numbers.length / 2 - 1, arr, 0, 2);
        } else {
            System.arraycopy(numbers, numbers.length / 2, arr, 0, 1);
        }

        return arr;
    }
}
