import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import strikt.api.expectThat
import strikt.assertions.containsExactly
import strikt.assertions.hasSize
import strikt.assertions.isEmpty

object ExampleWithSpekFeature : Spek({
    Feature("Can use Spek as Test Runner") {
        val subjectUnderTest by memoized { mutableListOf<String>() }

        Scenario("with strikt assertions") {

            When("adding foo") {
                subjectUnderTest.add("foo")
            }

            Then("it should have a size of 1") {
                expectThat(subjectUnderTest).hasSize(1)
            }

            Then("it should contain foo") {
                expectThat(subjectUnderTest).containsExactly("foo")
            }
        }

        Scenario("empty") {
            Then("should have a size of 0") {
                expectThat(subjectUnderTest).isEmpty()
            }
        }
    }
})