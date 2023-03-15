package HomeWorks;

import java.util.*;


public class homeWork_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> intArr = new ArrayList<Integer>();
        for (int i = 0; i < rand.nextInt(10, 20); i++) {
            intArr.add(rand.nextInt(10));
        }
//        System.out.printf("Integer Array => %s", intArr);
//        intArr.removeIf(e -> (e % 2) == 0);
//        System.out.printf("\nEven deleted Array => %s", intArr);

//        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        int max = Collections.max(intArr);
        int min = Collections.min(intArr);
        float avg = ((float) min + (float) max) / 2;

        System.out.printf("\nMax in Array => %s", max);
        System.out.printf("\nMin in Array => %s", min);
        System.out.printf("\nAvg between Min & Max => %s", avg);
    }
}
