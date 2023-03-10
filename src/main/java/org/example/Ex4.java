package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    /**
     * Отвалидировать доску судоку
     * Требования
     * Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
     * 1. Каждая строка должна содержать цифру 1-9 без повторения
     * 2. Каждая колонка должна содержать цифру 1-9 без повторения
     * 3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
     * Ограничения
     * • board.length == 9
     * • board[i].length == 9
     * • board[i][j] значение число или '.'
     **/
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));
    }

    /**
     * Метод поиска повторяющихся цифр в строке, столбце и блоке 3х3
     * осуществляет все проверки согласно условию задачи.
     *
     * @param board - двухмерный массив символов (цифры от '1' до '9' и '.')
     * @return истину, если все условия валидации соблюдены, ложь, если хотя бы одно условие не соблюдается
     */
    private static boolean isValidSudoku(char[][] board) {
        if (board.length == 9) {
            List<Character> charList = new ArrayList<>();
            charList.add('1');
            charList.add('2');
            charList.add('3');
            charList.add('4');
            charList.add('5');
            charList.add('6');
            charList.add('7');
            charList.add('8');
            charList.add('9');
            charList.add('.');
            for (int i = 0; i < board.length; i++) {
                if (board[i].length == 9) {
                    for (int j = 0; j < board[i].length; j++) {
                        if (charList.contains(board[i][j])) {
                            if (board[i][j] != '.') {
                                for (int k = j + 1; k < board[i].length; k++) {
                                    if (board[i][j] == board[i][k]) {
                                        System.out.println("В строке " + (i + 1) + " есть повторение на позиции " + (j + 1) + " и " + (k + 1));
                                        return false;
                                    }
                                }
                                for (int m = i + 1; m < board.length; m++) {
                                    if (board[i][j] == board[m][j]) {
                                        System.out.println("В столбце " + (j + 1) + " есть повторение на строке " + (i + 1) + " и " + (m + 1));
                                        return false;
                                    }
                                }
                            }
                        } else {
                            System.out.println("содержит не только цифры или точку: " + board[i][j]);
                            return false;
                        }
                    }
                } else {
                    System.out.println("количество элементов в строке не 9: " + board[i].length);
                    return false;
                }
            }
        } else {
            System.out.println("Количество строк не 9: " + board.length);
            return false;
        }
        int blockNum = 0;
        for (int blockRaw = 0; blockRaw < 7; blockRaw += 3) {
            for (int blocColumn = 0; blocColumn < 7; blocColumn += 3) {
                if (blockRaw == 0 && blocColumn == 0) {
                    blockNum = 1;
                } else if (blockRaw == 0 && blocColumn == 3) {
                    blockNum = 2;
                } else if (blockRaw == 0 && blocColumn == 6) {
                    blockNum = 3;
                } else if (blockRaw == 3 && blocColumn == 0) {
                    blockNum = 4;
                } else if (blockRaw == 3 && blocColumn == 3) {
                    blockNum = 5;
                } else if (blockRaw == 3 && blocColumn == 6) {
                    blockNum = 6;
                } else if (blockRaw == 6 && blocColumn == 0) {
                    blockNum = 7;
                } else if (blockRaw == 6 && blocColumn == 3) {
                    blockNum = 8;
                } else if (blockRaw == 6 && blocColumn == 6) {
                    blockNum = 9;
                }
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 4; j++) {
                        if (board[i - 1 + blocColumn][j - 1 + blockRaw] != '.') {
                            for (int k = i + 1; k < 4; k++) {
                                for (int l = j + 1; l < 4; l++) {
                                    if (board[i - 1 + blocColumn][j - 1 + blockRaw] == board[k - 1 + blocColumn][l - 1 + blockRaw]) {
                                        System.out.println("Есть повторение в блоке: " + blockNum);
                                        return false;
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        return true;
    }


}
