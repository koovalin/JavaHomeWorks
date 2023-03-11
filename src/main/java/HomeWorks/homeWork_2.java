package HomeWorks;

import java.util.Scanner;

public class homeWork_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи строку проверки: ");
        if(isPalindrome(scan.next())){
            System.out.println("Строка палиндром!");
        }
        else{
            System.out.println("Строка не палиндром!");
        }
    }
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
