package Gustavotestescom.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tenNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int temp = 0;
        for (int i = 0; i < tenNumbers.length / 2; i++) {

            temp = tenNumbers[tenNumbers.length - i - 1];
            tenNumbers[tenNumbers.length - i - 1] = tenNumbers[i];
            tenNumbers[i] = temp;

            System.out.println(Arrays.toString(tenNumbers));
            break;
        }
    }
}
