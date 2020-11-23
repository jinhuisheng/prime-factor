package example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/11/22.
 */
public class PrimeFactor {
    public static List<Integer> parse(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int candidate = 2; candidate <= number; candidate++) {
            while (number % candidate == 0) {
                factors.add(candidate);
                number = number / candidate;
            }
        }
        return factors;
    }
}
