import java.util.Arrays;
public class Sorting {

        public static void main(String[] args) {

            int[] array = {5, 3, 8, 1, 2, 7};

            System.out.println("Original array: " + Arrays.toString(array));

            Arrays.sort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }
}
