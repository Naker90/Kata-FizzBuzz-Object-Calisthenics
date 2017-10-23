public class BuzzRule implements RulesInterface{
    @Override
    public MyBoolean condition(MyNumber number) {
        return new MyBoolean(number.isMultipleOf(5));
    }

    @Override
    public MyString action() {
        return new MyString("Buzz");
    }
}
