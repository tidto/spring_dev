import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class JUnitQuiz {

    @Test
    public void test1() {

        String name1 = "a";
        String name2 = "b";
        String name3 = "c";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        assertThat(name1).isEqualTo(name2);
        assertThat(name1).isEqualTo(name3);
        assertThat(name2).isEqualTo(name3);

        int num1 = 1;

        assertThat(num1).isEqualTo(2);
        assertThat(num1).isNegative();
        assertThat(num1).isPositive();

        assertThat(num1).isGreaterThan(0);
        assertThat(num1).isGreaterThan(0);
    }
}
