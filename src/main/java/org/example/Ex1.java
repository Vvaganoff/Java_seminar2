package org.example;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int count = 0;
        for (String strNum:strArray
             ) {
            int num = Integer.parseInt(strNum);
            if (IsSimple(num)) {System.out.println(num); count += num;}
        }
        System.out.println("Сумма простых элементов последовательности: " + count);
    }

    /**
     * Функция проверяет является ли число простым
     * @param number - целое число
     * @return истина, если число простое или ложь, если число не является простым.
     */
    public static boolean IsSimple(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i < number/2; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
