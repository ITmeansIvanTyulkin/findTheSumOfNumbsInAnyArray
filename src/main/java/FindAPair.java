

/**
 * @author Ivan Tyulkin, Middle+ QA Engineer
 * @Date 16.05.2023
 */


public class FindAPair {
    public static int[] findAPair(int[] numbers, int shouldBeZero) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == shouldBeZero) {
                    System.out.println("Найденная пара чисел, дающая в сумме НОЛЬ, в данном массиве это: " + numbers[i] + " и " + numbers[j]);
                    return new int[] {numbers[i], numbers[j]};
                }
            }
        }
        System.out.println("Пары чисел, дающих в сумме НОЛЬ, в представленном массиве не найдено!");
        return new int[]{};
    }

    // Можно раскомментировать код ниже и запускать из Main для общей проверки работоспособности метода выше - FindAPair. Тесты же находятся в другом классе.

//    public static void main (String[] args) {
//        int[] numbers = {-3, 12, 4, 7, -5, -4, 11, 2, -1, 10};
//        int shouldBeZero = 0;
//
//        findAPair(numbers, shouldBeZero);
//    }
}