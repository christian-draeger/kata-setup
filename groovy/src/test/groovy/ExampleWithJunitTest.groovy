import org.junit.jupiter.api.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.containsInAnyOrder

class ExampleWithJunitTest {

    def subjectUnderTest = ["Eris", "Thor", "Anubis", "Ra"]

    @Test
    void "example using hamcrest matchers"() {

        assertThat(subjectUnderTest, containsInAnyOrder("Ra", "Eris", "Thor", "Anubis"))
    }

}
