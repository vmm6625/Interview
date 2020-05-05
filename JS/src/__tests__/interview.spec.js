main = require('../interview');

test('should return args passed in', () => {
    var args = ['one', 2];
    var result = main(args);
    expect(result).toBe(args);
});