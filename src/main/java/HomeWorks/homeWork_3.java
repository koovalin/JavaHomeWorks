package HomeWorks;

import java.util.*;


public class homeWork_3 {
    public static void main(String[] args) {
        Random rand = new Random();
//        List<Integer> intArr = new ArrayList<Integer>();
//        for (int i = 0; i < rand.nextInt(10,20); i++) {
//            intArr.add(rand.nextInt(10));
//        }
//        System.out.printf("Integer Array => %s", intArr);
//        intArr.removeIf(e -> (e % 2) == 0);
//        System.out.printf("\nEven deleted Array => %s", intArr);

//        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//        int max = Collections.max(intArr);
//        int min = Collections.min(intArr);
//        float avg = ((float)min+(float)max)/2;
//
//        System.out.printf("\nMax in Array => %s", max);
//        System.out.printf("\nMin in Array => %s", min);
//        System.out.printf("\nAvg between Min & Max => %s", avg);

//        3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        List<String> myList = Arrays.asList("bone", "young", "raw", "each", "bow", "division", "canal", "warn",
                                            "common", "tell", "ball", "race", "war", "someone", "destroy");
        int lSize = myList.size();
        List<String> myString = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(10,20); i++) {
            if(rand.nextInt(2) > 0){
                myString.add(myList.get(rand.nextInt(lSize)));
            }
            else{
                myString.add(String.valueOf(rand.nextInt(20)));
            }
        }
        System.out.printf("String Array => %s", myString);

        myString.removeIf(homeWork_3::isNumeric);
        System.out.printf("\nCleared String Array => %s", myString);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
