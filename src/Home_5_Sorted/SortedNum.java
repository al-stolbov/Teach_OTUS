package Home_5_Sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortedNum {
    public static List<Integer> pourList(List<Integer> newList, int num) {
        Random random = new Random();
        for (int i = num; i > 0; i--) {
            newList.add(random.nextInt(num)); /*вставка рандомных чисел в массив*/
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
        long startTime;
        long rezultTimeSortMy, rezultTimeSortProm;

        pourList(list, 10_000);

        startTime = System.currentTimeMillis();
        startSort(list); /*Сортировка своей реализацией*/
        rezultTimeSortMy = System.currentTimeMillis() - startTime;
        System.out.println("Сортировка своей реализацией: " + rezultTimeSortMy);


        pourList(list, 10_000);

        startTime = System.currentTimeMillis();
        Collections.sort(list); /*Сортировка промышленной реализацией*/
        rezultTimeSortProm = System.currentTimeMillis() - startTime;
        System.out.println("Сортировка коллекцией: " + rezultTimeSortProm);

        if (rezultTimeSortMy > rezultTimeSortProm) {
            System.out.println("Промышленная реализация работает быстрее на " + (rezultTimeSortMy - rezultTimeSortProm) + "мс, эффективнее использовать ее.");
        } else if (rezultTimeSortMy < rezultTimeSortProm) {
            System.out.println("Своя реализация работает быстрее на " + (rezultTimeSortProm - rezultTimeSortMy) + "мс, эффективнее использовать ее.");
        } else {
            System.out.println("Обе реализации работают одиннаково, можно использовать любую.");
        }

    }
}