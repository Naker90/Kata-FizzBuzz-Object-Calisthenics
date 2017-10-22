class FizzBuzzRule implements RulesInterface{
    @Override
    public boolean condition(MyNumber number) {
        return number.isMultipleOf(15);
    }

    @Override
    public Object action() {
        return new MyString("FizzBuzz");
    }
}
