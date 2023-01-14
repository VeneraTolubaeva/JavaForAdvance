import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        // Задача на поиск минимального числа в массиве
        int[] arr = {33, -2, 4, 67, 4, 9, 4};
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(String.format("minimal element is arr[%d] and value is %d"
                , minIndex, min));

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(String.format("maximal element is arr[%d] and value is %d"
                , maxIndex, max));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(String.format("sum is %d", sum));

        // Для демонстрации работы Scanner
        Scanner input = new Scanner(System.in);
        int summ = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number, to stop enter 0: ");
            number = input.nextInt();
            summ += number;
            System.out.println("summ so far is " + summ);
        }
    }
}
