describe('es6 tests with jest', () => {

    test('example using jest matchers', () => {
        const subjectUnderTest = "Thor";
        expect(subjectUnderTest).toEqual("Thor");
    });

    test('example using jest-extended matchers', () => {
        const subjectUnderTest = ["Eris", "Thor", "Anubis", "Ra"];
        expect(subjectUnderTest).toIncludeSameMembers(["Ra", "Eris", "Thor", "Anubis"]);
    });

});
