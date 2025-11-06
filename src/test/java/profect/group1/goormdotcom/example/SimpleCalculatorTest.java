package profect.group1.goormdotcom.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

    @Test
    @DisplayName("given: 두 정수 -> when: 더하면 -> then: 합을 반환한다")
    void givenTwoIntegers_whenAdd_thenReturnSum() {
        // given
        int a = 3;
        int b = 7;

        // when
        int result = a + b;

        // then
        assertThat(result).isEqualTo(9); // <- 여기 기대값 바꾸면 CI 깨짐
    }

    @Test
    @DisplayName("given: 두 정수 -> when: 뺄셈하면 -> then: 차를 반환한다")
    void givenTwoIntegers_whenSubtract_thenReturnDifference() {
        // given
        int a = 10;
        int b = 4;

        // when
        int result = a - b;

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("given: 두 실수 -> when: 나누기 하면 -> then: 기대한 소수 결과를 반환한다")
    void givenTwoDoubles_whenDivide_thenReturnQuotient() {
        // given
        double a = 7.0;
        double b = 2.0;

        // when
        double result = a / b;

        // then
        assertThat(result).isEqualTo(3.5);
    }

    @Test
    @DisplayName("given: 0으로 나누기 -> when: 연산하면 -> then: ArithmeticException이 발생한다")
    void givenZeroDivisor_whenDivide_thenThrowException() {
        // given
        int a = 10;
        int b = 0;

        // when & then
        assertThatThrownBy(() -> {
            int ignored = a / b;
        }).isInstanceOf(ArithmeticException.class);
    }

    @Test
    @DisplayName("given: 정수 리스트 -> when: 최대값을 구하면 -> then: 가장 큰 값을 반환한다")
    void givenList_whenFindMax_thenReturnMaxValue() {
        // given
        List<Integer> numbers = List.of(1, 5, 3, 9, 2);

        // when
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();

        // then
        assertThat(max).isEqualTo(9);
    }

    @Test
    @DisplayName("given: 정수 리스트 -> when: 평균값을 구하면 -> then: 기대한 평균을 반환한다")
    void givenList_whenCalculateAverage_thenReturnAverage() {
        // given
        List<Integer> numbers = List.of(2, 4, 6, 8);

        // when
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow();

        // then
        assertThat(avg).isEqualTo(5.0);
    }
}
