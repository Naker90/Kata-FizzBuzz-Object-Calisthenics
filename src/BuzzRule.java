public class BuzzRule implements RulesInterface{
    @Override
    public boolean condition(MyNumber number) {
        return number.isMultipleOf(5);
    }

    @Override
    public MyString action() {
        return new MyString("Buzz");
    }
}
