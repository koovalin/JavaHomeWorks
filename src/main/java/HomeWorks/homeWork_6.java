package HomeWorks;

import java.util.*;

public class homeWork_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop laptopMSI = new Laptop("MSI", "Windows", 512, 16, "Black");
        Laptop laptopAcer = new Laptop("Acer", "Windows", 1024, 16, "White");
        Laptop laptopHP = new Laptop("HP", "Windows", 512, 8, "Grey");
        Laptop laptopApple_1 = new Laptop("Apple", "macOS", 512, 16, "Grey");
        Laptop laptopApple_2= new Laptop("Apple", "macOS", 1024, 32, "Grey");

        List<Laptop> laptopList = List.of(laptopMSI, laptopAcer, laptopHP, laptopApple_1, laptopApple_2);
        String answer = "Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду\n3 - по HD памяти\n4 - по RAM памяти\n5 - по OS";
        System.out.println(answer);
        int choiceUserSearch = sc.nextInt();

        System.out.println("Введите фильтр: ");
        String nextChoice = sc.next();

        if (choiceUserSearch == 1) {
            for (Laptop color : laptopList) {
                if (color.getColor().equalsIgnoreCase(nextChoice)) {
                    color.displayInfo();
                }
            }

        } else if (choiceUserSearch == 2) {
            for (Laptop brand : laptopList) {
                if (brand.getName().equalsIgnoreCase(nextChoice)) {
                    brand.displayInfo();
                }
            }
        }
        else if (choiceUserSearch == 3){
            for (Laptop brand : laptopList) {
                if (brand.getHdMemory() > Integer.parseInt(nextChoice)) {
                    brand.displayInfo();
                }
            }
        }
        else if (choiceUserSearch == 4){
            for (Laptop brand : laptopList) {
                if (brand.getRamMemory() > Integer.parseInt(nextChoice)) {
                    brand.displayInfo();
                }
            }
        }
        else if (choiceUserSearch == 5){
            for (Laptop brand : laptopList) {
                if (brand.getOsType().equalsIgnoreCase(nextChoice)) {
                    brand.displayInfo();
                }
            }
        } else {
            System.out.println("Ошибка.\n" + answer);
        }
        sc.close();
    }
}
