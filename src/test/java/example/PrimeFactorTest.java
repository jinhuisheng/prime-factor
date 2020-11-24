package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/11/24.
 */
public class PrimeFactorTest {

    @Test
    void should_be_empty_when_parse_1() {
        assertThat(PrimeFactor.parse(1)).isEqualTo(new ArrayList<>());
    }

    @Test
    void should_be_2_when_parse_2() {
        assertThat(PrimeFactor.parse(2)).isEqualTo(Arrays.asList(2));
    }

    @Test
    void should_be_3_when_parse_3() {
        assertThat(PrimeFactor.parse(3)).isEqualTo(Arrays.asList(3));
    }

    @Test
    void should_be_2_and_2_when_parse_4() {
        assertThat(PrimeFactor.parse(4)).isEqualTo(Arrays.asList(2, 2));
    }

    @Test
    void should_be_2_and_3_when_parse_6() {
        assertThat(PrimeFactor.parse(6)).isEqualTo(Arrays.asList(2, 3));
    }

    @Test
    void should_be_2_and_2_and_2_when_parse_8() {
        assertThat(PrimeFactor.parse(8)).isEqualTo(Arrays.asList(2, 2, 2));
    }

    @Test
    void should_be_3_and_3_when_parse_9() {
        assertThat(PrimeFactor.parse(9)).isEqualTo(Arrays.asList(3, 3));
    }

    @Test
    void should_be_right_when_parse_60() {
        assertThat(PrimeFactor.parse(60)).isEqualTo(Arrays.asList(2, 2, 3, 5));
    }

    @Test
    void should_be_right_when_parse_420() {
        assertThat(PrimeFactor.parse(420)).isEqualTo(Arrays.asList(2, 2, 3, 5, 7));
    }

}
