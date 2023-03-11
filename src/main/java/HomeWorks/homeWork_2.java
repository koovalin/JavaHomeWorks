package HomeWorks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class homeWork_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение для записи в файл: ");
        String text = scan.nextLine();
        writeInFile(mergeText(text, 100));
    }

    public static String mergeText(String text, int loop) {
        return String.valueOf(text).repeat(Math.max(0, loop));
    }
    public static void writeInFile(String text){
        try(FileWriter writer = new FileWriter("src/main/resources/dz.txt", false))
        {
            writer.write(text);
            writer.flush();
            System.out.println("Запись внесена!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
