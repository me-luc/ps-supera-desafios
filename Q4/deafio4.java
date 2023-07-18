package Q4;

import java.util.Arrays;

public class deafio4 {
    public static void main(String[] args) {
        int quantity = 5;
        String[] arr = {
                "I ENIL SIHTHSIREBBIG S",
                "LEVELKAYAK",
                "H YPPAHSYADILO",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"
        };
        System.out.println(Arrays.toString(decipherLines(quantity, arr)));
    }

    static String[] decipherLines(int quantity, String[] arr) {
        String[] resultArr = new String[arr.length];

        for (int i = 0; i < quantity; i++) {
            String curr = arr[i];
            String endReverseStr = curr.substring(0, curr.length() / 2);
            String startReverseStr = curr.substring(curr.length() / 2, curr.length());
            resultArr[i] = new StringBuilder(startReverseStr + endReverseStr).reverse().toString();
        }

        return resultArr;
    }
}
