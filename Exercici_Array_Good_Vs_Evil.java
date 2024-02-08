package exercici_array_good_vs_evil;

public class Exercici_Array_Good_Vs_Evil {

    public static String battleResult(String goodCounts, String evilCounts) {
        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};

        int goodTotal = calculateTotal(goodCounts.split(" "), goodWorth);
        int evilTotal = calculateTotal(evilCounts.split(" "), evilWorth);

        if (goodTotal > evilTotal) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilTotal > goodTotal) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    private static int calculateTotal(String[] counts, int[] worth) {
        int total = 0;
        for (int i = 0; i < counts.length; i++) {
            total += Integer.parseInt(counts[i]) * worth[i];
        }
        return total;
    }

    public static void main(String[] args) {
        String goodCounts = "1 2 3 4 5 6";
        String evilCounts = "1 2 3 4 5 6 7";

        String result = battleResult(goodCounts, evilCounts);
        System.out.println(result);
    }
}