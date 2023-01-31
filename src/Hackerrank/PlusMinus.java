package Hackerrank;


import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> array) {

        double positive = 0, negative = 0, zero = 0;
        int arraySize = array.size();

        for (int i = 0; i < array.size(); i++) {

            if (array.get(i) > 0) {
                positive++;
            } else if (array.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(positive / arraySize);
        System.out.println(negative / arraySize);
        System.out.println(zero / arraySize);

    }
}
