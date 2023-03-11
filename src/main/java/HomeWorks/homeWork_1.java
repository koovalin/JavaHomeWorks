package HomeWorks;

public class homeWork_1 {
    public static void main(String[] args) {
        int[] array = new int[]{552, 284, 552, 738, 839, 555};
        minAndMaxInArr(array);
    }

    private static void minAndMaxInArr(int[] someArr) {
        int max = someArr[0];
        int min = someArr[0];
        for (int i: someArr){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.printf("Min = %s\nMax = %s", min,max);
    }
}