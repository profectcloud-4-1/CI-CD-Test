package profect.group1.goormdotcom.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    @DisplayName("given: 문자열 -> when: 대문자로 변환하면 -> then: 모든 문자가 대문자가 된다")
    void givenString_whenToUpperCase_thenAllCharsAreUppercase() {
        // given
        String input = "ci pipeline";

        // when
        String result = input.toUpperCase(Locale.ROOT);

        // then
        assertThat(result).isEqualTo("CI PIPELINE");
    }

    @Test
    @DisplayName("given: 문자열 -> when: 공백을 제거하면 -> then: 공백이 없는 문자열이 된다")
    void givenString_whenRemoveSpaces_thenNoSpaces() {
        // given
        String input = "  hello   world  ";

        // when
        String result = input.replace(" ", "");

        // then
        assertThat(result).isEqualTo("helloworld");
    }

    @Test
    @DisplayName("given: 회문 문자열 -> when: 앞뒤를 비교하면 -> then: 회문임을 알 수 있다")
    void givenPalindrome_whenCheck_thenReturnTrue() {
        // given
        String input = "racecar";

        // when
        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equals(reversed);

        // then
        assertThat(isPalindrome).isTrue();
    }

    @Test
    @DisplayName("given: 문자열과 문자 -> when: 등장 횟수를 세면 -> then: 기대한 횟수를 반환한다")
    void givenStringAndChar_whenCountOccurrences_thenReturnCount() {
        // given
        String input = "banana";
        char target = 'a';

        // when
        long count = input.chars()
                .filter(ch -> ch == target)
                .count();

        // then
        assertThat(count).isEqualTo(3);
    }
}

