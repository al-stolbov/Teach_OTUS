package Home_5_Sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedNum {
    public static List<Integer> pourList(List<Integer> newList, int num) {
        for (int i = num; i > 0; i--) {
            newList.add(i); /*вставка в массив*/
            newList.add(num - i); /*вставляем дубли*/
        }
        return newList;
    }

    public static List<Integer> startSort(List<Integer> listForSort) {
        int minInt, minIntIndex;
        List<Integer> listTemp = new ArrayList<>(listForSort); /*копируем данные во временный массив*/
        listForSort.clear();

        while (!listTemp.isEmpty()) { /*цикл пока не пустой массив*/
            minInt = listTemp.stream().min(Integer::compareTo).get(); /*определяем максимальное значение*/
            minIntIndex = listTemp.indexOf(minInt); /*определяем индекс максимального значения*/
            listTemp.remove(minIntIndex); /*удаляем максимальное значение из массива*/
            listForSort.add(minInt); /*вставляем значения в массив в порядке возрастания*/
        }
        return listForSort;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long startTime, endTime;

        pourList(list, 50);

        startTime = System.currentTimeMillis();
        startSort(list); /*Сортировка*/
        System.out.println(list); /*Вывод отсортированного массива*/
        endTime = System.currentTimeMillis();
        System.out.println("Сортировка своей реализацией: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Collections.sort(list); /*Сортировка*/
        System.out.println(list); /*Вывод отсортированного массива*/
        endTime = System.currentTimeMillis();
        System.out.println("Сортировка коллекцией: " + (endTime - startTime));
    }
}