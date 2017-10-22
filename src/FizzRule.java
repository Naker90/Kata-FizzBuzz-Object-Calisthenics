public class FizzRule implements RulesInterface{
    @Override
    public boolean condition(MyNumber number) {
        return number.isMultipleOf(3);
    }

    @Override
    public MyString action() {
        return new MyString("Fizz");
    }
}
