import spock.lang.Specification

import static org.hamcrest.Matchers.containsInAnyOrder

class ExampleWithSpockSpec extends Specification {

    def "pure spock"() {
        given:
        def subjectUnderTest = ["Eris", "Thor", "Anubis", "Ra"]

        expect:
        subjectUnderTest containsInAnyOrder("Ra", "Eris", "Thor", "Anubis")
    }

}
