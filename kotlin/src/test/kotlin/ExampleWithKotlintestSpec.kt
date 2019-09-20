import assertk.assertThat
import assertk.assertions.containsOnly
import io.kotlintest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotlintest.specs.DescribeSpec
import strikt.api.expectThat
import strikt.assertions.containsExactlyInAnyOrder

class ExampleWithKotlintestSpec : DescribeSpec({

    val subjectUnderTest = listOf("Eris", "Thor", "Anubis", "Ra")

    describe("example using kotlinTest") {

        it("uses kotlinTests build-in matchers") {
            subjectUnderTest shouldContainExactlyInAnyOrder listOf("Ra", "Eris", "Thor", "Anubis")
        }

        it("uses strikt matchers") {
            expectThat(subjectUnderTest)
                    .containsExactlyInAnyOrder("Ra", "Eris", "Thor", "Anubis")
        }

        it("uses assertK matchers") {
            assertThat(subjectUnderTest)
                    .containsOnly("Ra", "Eris", "Thor", "Anubis")
        }
    }

})
