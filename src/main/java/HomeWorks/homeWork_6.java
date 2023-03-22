package HomeWorks;

import java.util.*;

public class homeWork_6 {
    public static void main(String[] args) {
        Laptop laptopMSI = new Laptop(1, "MSI", "Windows", 512, 16, "Black");
        Laptop laptopAcer = new Laptop(2, "Acer", "Windows", 1024, 16, "White");
        Laptop laptopHP = new Laptop(3, "HP", "Windows", 512, 8, "Grey");
        Laptop laptopApple = new Laptop(4, "Apple", "macOS", 1024, 16, "Grey");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptopMSI);
        laptopList.add(laptopAcer);
        laptopList.add(laptopHP);
        laptopList.add(laptopApple);

    }
}
