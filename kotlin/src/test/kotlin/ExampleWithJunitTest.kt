import assertk.assertThat
import assertk.assertions.containsOnly
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder

class ExampleWithJunitTest {

    private val subjectUnderTest = listOf("Eris", "Thor", "Anubis", "Ra")

    @Test
    internal fun `example using strikt`() {
        expectThat(subjectUnderTest)
                .containsExactlyInAnyOrder("Ra", "Eris", "Thor", "Anubis")
    }

    @Test
    internal fun `example using assertK`() {
        assertThat(subjectUnderTest)
                .containsOnly("Ra", "Eris", "Thor", "Anubis")

    }

    @Test
    internal fun `example using assertJ`() {
        Assertions.assertThat(subjectUnderTest)
                .containsExactlyInAnyOrder("Ra", "Eris", "Thor", "Anubis")

    }
}
