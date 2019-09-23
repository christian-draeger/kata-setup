import {sum} from "../../main/js/es6-example";

describe('es6 tests with jest', () => {

    test('example using jest matchers', () => {
        const subjectUnderTest = "Thor";
        expect(subjectUnderTest).toEqual("Thor");
    });

    test('example using jest-extended matchers', () => {
        const subjectUnderTest = ["Eris", "Thor", "Anubis", "Ra"];
        expect(subjectUnderTest).toIncludeSameMembers(["Ra", "Eris", "Thor", "Anubis"]);
    });

    test('sum will work with natural numbers', () => {
        const result = sum(5, 3);
        expect(result).toBe(8)
    });

    test('sum will work with negative numbers', () => {
        const result = sum(5, -3);
        expect(result).toBe(2)
    });

});
