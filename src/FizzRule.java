public class FizzRule implements RulesInterface{
    @Override
    public MyBoolean condition(MyNumber number) {
        return new MyBoolean(number.isMultipleOf(3));
    }

    @Override
    public MyString action() {
        return new MyString("Fizz");
    }
}
