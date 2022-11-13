public class Main {
    /*Необходимо реализовать следующий метод
         1. Получаем на входе массив чисел.
         2. Все четные числа увеличиваем на единицу.
         3. Возвращаем кусок списка с 3-го по 7-й элемент.
         */
    public static int enterMassiveNumber( int[] numbers){
        int i = 0;
        for (i = 0; i < numbers.length - 1; i++){
            if (numbers[i] % 2 == 0) {
                numbers[i] += 1;
            }
            for (i=2; i<7; i++){
                System.out.println("элементы " + i);
            }
        }
        return numbers[1];
    }
    public static void main(String[] args) {
        int[] ululuha = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("" + enterMassiveNumber(ululuha));
    }
}