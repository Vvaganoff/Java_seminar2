package org.example;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел: ");
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println(Sequence(array));

    }
    public static String Sequence(int[] array)
    {

        if (array[0] == array[1])
        {
            return "Нет последовательности";
        }
        boolean isAscending = array[0] < array[1];
        for (int i = 2; i < array.length; i++)
        {
            if ((array[i - 1] >= array[i] && isAscending) ||
                    (array[i - 1] <= array[i] && !isAscending))
            {
                return "Нет последовательности";
            }
        }
        return (isAscending ? "Восходящая" : "Нисходящая");
    }
}
