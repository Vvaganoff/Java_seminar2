package org.example;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел: ");
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];
        boolean isAscending = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
            if (i > 0) {
                if (array[i - 1] < array[i] && isAscending) {
                    isAscending = true;
                } else {
                    isAscending = false;
                }
            }
        }
        if (isAscending) {
            System.out.println("Последовательность восходящая.");
        } else {
            System.out.println("Последовательность не восходящая.");
        }

    }

}


