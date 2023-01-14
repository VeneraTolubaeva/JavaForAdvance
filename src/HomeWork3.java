import java.util.stream.Stream;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int z = 1;
        System.out.println("Задача №" + z++);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        System.out.println("Задача №" + z++);

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        System.out.println("Задача №" + z++);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(String.format("min = %d", min));

        System.out.println("Задача №" + z++);

        int mean = sum / (array.length - 0);
        System.out.println("mean = " + mean);
        double mean1 = ((double) sum / (array.length - 0));
        System.out.println("mean1 = " + mean1);

        System.out.println("Задача №" + z++);

        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int summa = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                summa += arr[i][j];
            }
        }
        System.out.println("summa = " + summa);

        System.out.println("Задача №" + z++);

        int maximum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maximum < arr[i][j]) {
                    maximum = arr[i][j];
                }
            }

        }
        System.out.println("maximum = " + maximum);

        System.out.println("Задача №" + z++);

        int count = Stream.of(arr).mapToInt(m -> m.length).sum();
        System.out.println("count = " + count);
    }
}
