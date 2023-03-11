package HomeWorks;

import java.util.*;

public class homeWork_5 {
    public static Map<String, ArrayList<String>> myPhoneBook  = new HashMap<>();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        myPhoneBook.put("Лидия Аркадьевна Бубликова", new ArrayList<>(List.of("89061234156", "89167658191")));
        myPhoneBook.put("Иван Михайлович Серебряков", new ArrayList<>(List.of("89260981237")));
        myPhoneBook.put("Дональд Джон Трамп", new ArrayList<>(List.of("89160914589", "89060981234")));

        while(true){
            Integer choice = menu();
            switch(choice){
                case 1 -> homeWork_5.getAllContacts();
                case 2 -> homeWork_5.addContact();
                case 3 -> homeWork_5.getNameByPhone(getPhoneNumber());
                case 4 -> homeWork_5.getPhonesByName(getName());
                case 5 -> homeWork_5.getAllNames();
                case 6 -> homeWork_5.getAllNumbers();
            }
        }
    }



    public static Integer menu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        String menu = """
            \nГлавное меню:
            1. Список контактов
            2. Добавить контакт
            3. Найти контакт по номеру
            4. Найти контакт по имени
            5. Список всех имен
            6. Список всех номеров
            """;
        System.out.print("\n" + menu);
        System.out.print("Введите пункт меню: ");
        choice = Integer.parseInt(sc.nextLine());
        if(choice > 0 & choice < 7){
            return choice;
        }
        else{
            System.out.println("\nВведите число от 1 до 6!!");
            return -1;
        }

    }

    public static void getAllContacts() {

        System.out.println();
        Integer numeric = 1;
        for (String key : myPhoneBook.keySet()) {
            System.out.printf("\t%3s) %-25s\t: %s\n", numeric, key, myPhoneBook.get(key));
            numeric++;
        }
    }

    public static void addContact() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведи имя контакта: ");
        String key = sc.nextLine();
        System.out.print("\nВведи номера телефона контакта через запятую: ");
        ArrayList<String> value = new ArrayList<>(Arrays.asList(sc.nextLine().replace(" ","").split(",")));
        myPhoneBook.put(key, value);
    }

    public static void getNameByPhone(String value) {
        Integer count = 1;
        for (String key : myPhoneBook.keySet()) {
            for (String val: myPhoneBook.get(key)){
                if(val.toLowerCase().contains(value)){
                    System.out.printf("\t%3s) %s\n",count, key);
                    count++;
                }
            }
        }
    }

    public static void getPhonesByName(String name) {
        Integer count = 1;
        for (String key: myPhoneBook.keySet()){
            if(key.toLowerCase().contains(name.toLowerCase())){
                System.out.println("\n" + key);
                for (String val: myPhoneBook.get(key)) {
                    System.out.printf("\t%3s) %s\n", count, val);
                    count++;
                }

            }
        }
    }

    private static void getAllNames() {
        Integer count = 1;
        for (String key: myPhoneBook.keySet()){
            System.out.printf("\n\t%3s) %s", count, key);
            count++;
        }
    }

    public static void getAllNumbers() {
        Integer count = 1;
        for (String key: myPhoneBook.keySet()){
            for(String value: myPhoneBook.get(key)){
                System.out.printf("\n\t%s) %s ", count, value);
                count++;
            }
        }
    }

    public boolean checkContacts(String name) {
        return false;
    }

    public boolean isCorrect(String name, String phone){
        return true;
    }

    public static String getPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите 9 цифр номера для поиска: ");
        return sc.nextLine();
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите имя для поиска: ");
        return sc.nextLine();
    }
}
