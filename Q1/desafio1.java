package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio1 {
    public static void main(String[] args) {
        int[] testingArr = new int[]{10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98};
        System.out.println(Arrays.toString(sortEvenAndOdd(testingArr)));
    }

    public static int[] sortEvenAndOdd(int[] arr) {
        int length = arr[0];
        List oddArr = new ArrayList<Integer>();
        List evenArr = new ArrayList<Integer>();

        for(int i = 1; i < length + 1; i++) {
            boolean isEven = arr[i] % 2 == 0;

            if(isEven) {
                evenArr.add(arr[i]);
                continue;
            }

            oddArr.add(arr[i]);
        }

        for (int k = 0; k < evenArr.size(); k++) {
            int smallest = k;
            for (int m = k + 1; m < evenArr.size(); m++) {
                if((int) evenArr.get(m) < (int) evenArr.get(smallest))
                    smallest = m;
            }

            Object aux = evenArr.get(smallest);
            evenArr.set(smallest, evenArr.get(k));
            evenArr.set(k, aux);
        }

        for (int k = 0; k < oddArr.size(); k++) {
            int bigger = k;
            for (int m = k + 1; m < oddArr.size(); m++) {
                if((int) evenArr.get(m) > (int) evenArr.get(bigger))
                    bigger = m;
            }

            Object aux = oddArr.get(bigger);
            oddArr.set(bigger, oddArr.get(k));
            oddArr.set(k, aux);
        }


        List sortedList = new ArrayList<Integer>();
        sortedList.addAll(evenArr);
        sortedList.addAll(oddArr);

        return sortedList.stream().mapToInt(i -> (int) i).toArray();
    }
}