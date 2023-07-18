package Q3;

import java.util.Hashtable;

public class desafio3 {
    public static void main(String[] args){
        int target = 1;
        //int[] arr = {1, 5, 3, 4, 2};
        int[] arr = generateLargeArray();
        System.out.println(findPairCount(target, arr));
    }

    public static int findPairCount(int target, int[] pairs) {
        int count = 0;
        Hashtable<Integer, Integer> hash = new Hashtable<>();

        for (int i = 0; i < pairs.length; i++) {
            hash.put(pairs[i], pairs[i]);
        }

        for (int i = 0; i < pairs.length; i++) {
            int remaining = pairs[i] - target;
            if(hash.get(remaining) != null) {
                count++;
            }
        }

        return count;
    }

    private static int[] generateLargeArray() {
        int size = 10000000;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }

        return arr;
    }
}
