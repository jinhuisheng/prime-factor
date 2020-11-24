package example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/11/24.
 */
public class PrimeFactor {
    public static List<Integer> parse(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int divisor = 2; divisor <= number; divisor++) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number = number / divisor;
            }
        }
        return primeFactors;
    }
}
