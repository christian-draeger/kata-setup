import org.assertj.core.util.Lists;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ExampleWithJunitTest {

    private List<String> subjectUnderTest = Arrays.asList("Eris", "Thor", "Anubis", "Ra");

    @Test
    void exampleUsingAssertJ() {
        assertThat(subjectUnderTest)
                .containsExactlyInAnyOrder("Ra", "Eris", "Thor", "Anubis");
    }

    @Test
    void exampleUsingHamcrestAssertions() {
        MatcherAssert.assertThat(subjectUnderTest, containsInAnyOrder("Ra", "Eris", "Thor", "Anubis"));
    }

    @Test
    void exampleUsingJunitAssertions() {
        Assertions.assertEquals(
                Lists.newArrayList("Eris", "Thor", "Anubis", "Ra"),
                subjectUnderTest
        );
    }
}
