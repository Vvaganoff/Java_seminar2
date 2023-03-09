package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел: ");
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
            if (array[i]>9 && array[i]<100){
                summa+=i;
            }
        }
        ArrayChange(array, summa);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Функция изменяет массив согласно условию
     * @param array - массив целых чисел
     * @param summa - целое число, на которое заменяем отрицательные элементы
     */
    private static void ArrayChange(int[] array, int summa) {
        for (int i=0; i<array.length; i++) {
            if (array[i]<0){
                array[i] = summa;
            }
        }
    }
}
