
/**
 Составить частотный словарь элементов одномерного массива
Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.
Пример:
Есть набор данных
program { 1, 9, 9, 0, 2, 8, 0, 9 }

частотный массив может быть представлен так:

0 встречается 2 раза
1 встречается 1 раз
2 встречается 1 раз
8 встречается 1 раз
9 встречается 3 раза
 */

import java.util.Arrays;

public class Sem_1_FrequientDict {

    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 9, 9, 0, 2, 8, 0, 9 };
        int count = 1;
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(array1[i] + " встречается " + count + " раза");
                i = i + count - 1;
            }
            count = 1;
        }
    }
}