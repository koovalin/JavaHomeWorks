package HomeWorks;

import java.util.*;


public class homeWork_5_t2 {
    public static void main(String[] args) {
        t2();
    }

    private static void t2() {
        List<String> myList = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                                                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова","Марина Светлова", "Мария Савина",
                                                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        HashMap<String, Integer> myMap = new HashMap<>();
        for (String name: myList) {
            String takenName = name.split(" ")[0];
            if(!myMap.containsKey(takenName)){
                myMap.put(takenName, 1);
            }
            else{
                myMap.put(takenName, myMap.get(takenName)+1);
            }
        }

        TreeSet<Integer> sortedList = new TreeSet<>(myMap.values());
        for(Integer countOf: sortedList.descendingSet()) {
            for(String name: myMap.keySet()){
                if(Objects.equals(countOf, myMap.get(name))){
                    System.out.printf("%-8s -> %2s\n",name, countOf);
                }
            }
        }
    }
}
