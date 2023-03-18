package HomeWorks;

import java.util.*;

public class homeWork_4 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "first", "second", "third");

        while(true){
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine().toLowerCase();
            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equalsIgnoreCase("print~all")) {
                for (int i = 0; i < wordsList.size(); i++) {
                    System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
                }
                continue;
            }
            if(inputString.equalsIgnoreCase("print")){
                for (int i = wordsList.size()-1; i > -1; i--) {
                    System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
                }
                continue;
            }
            if (inputString.equalsIgnoreCase("revert")) {
                wordsList.removeLast();
                continue;
            }
            if (inputString.equalsIgnoreCase("exit")){
                break;
            }

            if (!inputString.contains("~")) {
                wordsList.add(inputString);
                System.out.printf("Слово %s добавлено в список!", inputString);
                continue;
            }
            String[] parts = inputString.split("~"); // word~index
            String word = parts[0];
            int num = 0;

            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
            }

            if (word.equalsIgnoreCase("print")) {
                System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                wordsList.remove(num - 1);
            }
            else if (num == wordsList.size() + 1) {
                wordsList.add(word);
                System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
            } else {
                String oldWord = wordsList.get(num - 1);
                wordsList.set(num - 1, word);
                System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
            }
            if (word.equalsIgnoreCase("remove")) {
                if (num > wordsList.size()+1) {
                    System.out.printf("В списке нет слова на позиции %d", num);
                }
                else {
                    String oldWord = wordsList.get(num - 1);
                    System.out.printf("Слово %s на позиции %d удалено!", oldWord, num);
                }
            }
        }
    }
}
