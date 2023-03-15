package HomeWorks;

import java.util.*;


public class homeWork_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> intArr = new ArrayList<Integer>();
        for (int i = 0; i < rand.nextInt(10, 20); i++) {
            intArr.add(rand.nextInt(10));
        }
        System.out.printf("Integer Array => %s", intArr);
        intArr.removeIf(e -> (e % 2) == 0);
        System.out.printf("\nEven deleted Array => %s", intArr);
    }
}
