package quickSrot;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] testData = {8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43};

        int low = 0;
        int high = testData.length - 1;

        quickSort(testData, low, high);
        System.out.println(Arrays.toString(testData));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        //выбрать опорный элемент
        int middle = low + (high - low) / 2;

        int opora = array[middle];
        System.out.println("opora = " + opora);

        //разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        //вызов рекурсии для сортировки левой и правой части
        if (low < j){
            System.out.println("j = " + j);
            System.out.println("i = " + j);
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(array));
            System.out.printf("opora = " + opora);
            quickSort(array, low, j);
        }
        if (high > i) {
            System.out.println("i = " +i);
            System.out.println("j = " + j);
            System.out.println(Arrays.toString(array));
            quickSort(array, i, high);
        }
    }

}
