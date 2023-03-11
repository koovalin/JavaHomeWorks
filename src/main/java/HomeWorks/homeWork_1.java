package HomeWorks;

import java.util.Scanner;

public class homeWork_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = Integer.parseInt(reader.next());
        if (isLeapYear(year)) {
            System.out.println("Год весокосный!");
        }
        else{
            System.out.println("Год не весокосный!");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }
}