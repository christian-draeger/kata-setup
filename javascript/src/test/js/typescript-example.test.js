import {sum} from "../../main/js/typescript-example";

describe('es6 tests with jest', () => {

    test('sum will work with natural numbers', () => {
        const result = sum(5, 3);
        expect(result).toBe(8)
    });

    test('sum will work with negative numbers', () => {
        const result = sum(5, -3);
        expect(result).toBe(2)
    });

});
