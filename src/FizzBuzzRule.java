class FizzBuzzRule implements RulesInterface{
    @Override
    public MyBoolean condition(MyNumber number) {
        return new MyBoolean(number.isMultipleOf(15));
    }

    @Override
    public Object action() {
        return new MyString("FizzBuzz");
    }
}
