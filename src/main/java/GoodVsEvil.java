import java.util.Arrays;
import java.util.stream.IntStream;

public class GoodVsEvil {

    public String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};

        int[] good = Arrays.stream(goodAmounts.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] evil = Arrays.stream(evilAmounts.split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int goodScore = IntStream.rangeClosed(0, good.length - 1)
                .map(i -> good[i] * goodWorth[i])
                .sum();
        int evilScore = IntStream.rangeClosed(0, evil.length - 1)
                .map(i -> evil[i] * evilWorth[i])
                .sum();

        if (goodScore > evilScore) {
            return "Battle Result: Good triumphs over Evil";
        }

        if (evilScore > goodScore) {
            return "Battle Result: Evil eradicates all trace of Good";
        }

        return "Battle Result: No victor on this battle field";
    }
}
