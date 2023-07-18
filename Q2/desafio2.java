package Q2;

import java.util.Hashtable;

public class desafio2 {
    public static void main(String[] args) {
        float testValue = 576.73f;
        changeMoney(testValue);
    }

    public static void changeMoney(float value) {
        Hashtable<Float, Integer> change = new Hashtable<>();
        float[] moneyKeys = {0.01f, 0.05f, 0.10f, 0.25f, 0.50f, 1.00f, 2.00f, 5.00f, 10.00f, 20.00f, 50.00f, 100.00f };
        float count = 0;
        int aux = moneyKeys.length - 1;

        while(aux >= 0) {
            if(count + moneyKeys[aux] > value) {
                aux--;
                continue;
            }
            count += moneyKeys[aux];
            var curr = change.get(moneyKeys[aux]);
            if(curr != null) change.put(moneyKeys[aux], curr + 1);
            else change.put(moneyKeys[aux], 1);
        }

        System.out.println("MOEDAS:\n");
        for(int i = 0; i <= 5; i++) {
            if(change.get(moneyKeys[i]) != null) System.out.printf("%s moeda (s) de R$ %.2f\n", change.get(moneyKeys[i]), moneyKeys[i]);
        }

        System.out.println("\nNOTAS:\n");
        for(int i = 6; i < moneyKeys.length; i++) {
            if(change.get(moneyKeys[i]) != null) System.out.printf("%s nota (s) de R$ %.2f\n", change.get(moneyKeys[i]), moneyKeys[i]);
        }
    }
}

