public class Main {
    /*Необходимо реализовать следующий метод
         1. Получаем на входе массив чисел.
         2. Все четные числа увеличиваем на единицу.
         3. Возвращаем кусок списка с 3-го по 7-й элемент.
         */

    public static void main(String[] args) {
        int[] ululuha = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        enterMassiveNumber(ululuha);
    }

    public static int[] enterMassiveNumber( int[] numbers){

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                numbers[i] += 1;
            }
            if (i >= 2 && i <= 7){
                System.out.print(numbers[i] + " ");
            }
        }
        return numbers;
    }
}